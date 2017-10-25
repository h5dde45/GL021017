package ru.n2.t9.labs.lab2;

public class Producer implements Runnable {
    private int startValue;
    private final int period;
    private final Buffer_2 buffer;


    public Producer(int startValue, int period, Buffer_2 buffer) {
        this.startValue = startValue;
        this.period = period;
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                buffer.put(startValue);
                System.out.println(startValue++ + " produced_2");
                System.out.println("===================");
                Thread.sleep(period);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName());
                return;
            }
        }
    }
}
