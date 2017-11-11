package ru.core.mt.p1.t4;

public class Main {
    static volatile boolean ready = false;
    static int data = 0;

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                sleep(100);
//                data = 1;
                ready = true;
                data = 1;

            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (!ready);
                System.out.println(data);
            }
        }).start();
    }

    private static void sleep(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
