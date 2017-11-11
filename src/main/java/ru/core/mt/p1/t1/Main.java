package ru.core.mt.p1.t1;

public class Main {
    public static final int N = 10_000_000;
    public  static int count = 0;
//    public  static AtomicInteger count = new AtomicInteger(0);


    public static void main(String[] args) throws InterruptedException {
        Thread t0 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < N; i++) {
//                    count.incrementAndGet();
//                    count++;
                    inc();
                }
            }
        });
        t0.start();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < N; i++) {
//                    count.incrementAndGet();
//                    count++;
                    inc();
                }
            }
        });
        t1.start();

        t0.join();
        t1.join();

        System.out.println(count);

    }

    private synchronized static void inc() {
        count++;
    }
}
