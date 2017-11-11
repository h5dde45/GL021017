package ru.core.mt.p2;

public class App {
    public static void main(String[] args) {
        final Thread[]threads=new Thread[2];

        threads[0]=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    threads[1].join();
                } catch (InterruptedException e) {
                }
            }
        });
        threads[1]=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    threads[0].join();
                } catch (InterruptedException e) {
                }
            }
        });
        threads[0].start();
        threads[1].start();


    }
}
