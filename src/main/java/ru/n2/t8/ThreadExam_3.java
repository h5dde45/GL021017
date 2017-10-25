package ru.n2.t8;

public class ThreadExam_3 {
    public static void main(String[] args) throws InterruptedException {

        final Thread mainThread = Thread.currentThread();
        Thread runThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Run: wait for main...");
                try {
                    mainThread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        runThread.start();

        System.out.println("Main: wait for run...");
        runThread.join(2222);

//        thread.join(2222);
//        new Object().wait();
//        new Object().notify();

    }
}
