package ru.n1.t9;

public class Consumer implements Runnable {
    private final SimpleExBuf buf;

    public Consumer(SimpleExBuf buf) {
        this.buf = buf;
    }

    @Override
    public void run() {
        while (true) {
            try {
                int elem=buf.get();
                System.out.println(elem+" consumer");
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName());
                return;
            }
        }
    }
}
