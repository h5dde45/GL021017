package ru.n1.t8;

public class ThreadEx_3A {
    public static void main(String[] args) throws InterruptedException {
        final Thread mainThread=Thread.currentThread();

        Thread runThread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Run: wait for main");
                try {
                    mainThread.join(1111);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        runThread.start();

        System.out.println("Main: wait for run");
        runThread.join();

    }
}
