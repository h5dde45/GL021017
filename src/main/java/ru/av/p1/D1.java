package ru.av.p1;

public class D1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
//            new NewThread().start();
            new Thread(new NewRunnable()).start();
//            new Thread(() -> System.out.println(Thread.currentThread().getName())).run();
        }
    }

    private static class NewThread extends Thread{
        @Override
        public void run() {
            System.out.println(getName());
        }
    }
    private static class NewRunnable implements Runnable{
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
