package ru.core.mt.p2.p4;

public class App {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("++");
                }
            }
        });
        thread.setDaemon(true);
        thread.start();
//        Thread.yield();
        System.out.println("=====");
    }
}
