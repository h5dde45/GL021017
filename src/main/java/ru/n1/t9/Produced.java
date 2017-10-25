package ru.n1.t9;

public class Produced implements Runnable {

    private int startValue;
    private final int period;
    private final SimpleExBuf buf;

    public Produced(int startValue, int period, SimpleExBuf buf) {
        this.startValue = startValue;
        this.period = period;
        this.buf = buf;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println(startValue + " produced");
                buf.put(startValue++);
                Thread.sleep(period);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName());
                return;
            }
        }
    }
}
