package ru.core.mt.p4;

public class Consumer implements Runnable {
    private final SingleElementBuffer buffer;

    public Consumer(SingleElementBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Integer elem = buffer.get();
                System.out.println(elem + " consumer");
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName()+"");
                return;
            }
        }
    }
}
