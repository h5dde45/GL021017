package ru.core.mt.p1.t3;

public class App {
    public static void main(String[] args) throws InterruptedException {

        new Thread(new NewRunnable()).start();

        for (int i = 0; i < 1000; i++) {
            Thread.sleep(100);
            System.out.println(i);
        }

//        Thread.sleep(222);
//        System.out.println(Thread.activeCount());
//        Thread thread = new Thread(new NewRunnable());
//        System.out.println(Thread.activeCount());
//        thread.start();
//
//        System.out.println(Thread.activeCount());

    }
}

class NewRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
//                e.printStackTrace();
            }
            System.out.println("  " + i);
        }

    }
}

