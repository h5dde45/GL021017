package ru.core.mt.p2.p4;

public class Main {
    public static volatile boolean stop = false;

    public static void main(String[] args) throws InterruptedException {
        final Thread[] threads = new Thread[32];

        for (int i = 0; i < 32; i++) {
            final int fI = i;
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000_000_000_000_000_000L; j++) {
                        if (stop) {
                            System.out.println(fI + ": " + j);
                            break;
                        }
                    }
                }
            });
        }
        for (int i = 0; i < 32; i++) {
            threads[i].setPriority(i < 16 ? Thread.MIN_PRIORITY : Thread.NORM_PRIORITY);
        }
        for (int i = 0; i < 32; i++) {
            threads[i].start();
        }

        Thread.sleep(1111);
        stop = true;
    }
}
