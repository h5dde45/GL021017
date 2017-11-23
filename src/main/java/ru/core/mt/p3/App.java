package ru.core.mt.p3;

public class App {
    public static void main(String[] args) throws InterruptedException {
        final Object lock=new Object();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Run started");
                synchronized (lock){
                    System.out.println("run in");
                    while (true);
                }
            }
        }).start();
        System.out.println("main start sleep");
        Thread.sleep(1111);
        System.out.println("main stop sleep");
        synchronized (lock){
            System.out.println(" main in");
        }
    }
}
