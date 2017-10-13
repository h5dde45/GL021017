package ru.n2.t9.labs.lab_1;

public class Consumer implements Runnable {
    private final Buffer_1 buffer;

    public Consumer(Buffer_1 buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                int elem = buffer.get();
                System.out.println(elem + " consumer_1");
                System.out.println("===================");
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName());
                return;
            }
        }
    }
}
