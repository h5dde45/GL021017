package ru.n2.t9.labs.lab2;

public class Consumer implements Runnable {
    private final Buffer_2 buffer;

    public Consumer(Buffer_2 buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                int elem = buffer.get();
                System.out.println(elem + " consumer_2");
                System.out.println("===================");
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName());
                return;
            }
        }
    }
}
