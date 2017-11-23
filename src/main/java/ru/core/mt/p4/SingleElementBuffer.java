package ru.core.mt.p4;

public class SingleElementBuffer {
    private Integer elem = null;
    private int waitedConsumers = 0;
    private int waitedProducers = 0;

    public synchronized void put(int newElem) throws InterruptedException {
        while (this.elem != null) {
            waitedProducers++;
            this.wait();
            waitedProducers--;
        }
        this.elem = newElem;
        if (waitedConsumers > 0) {
            this.notify();
        }
    }

    public synchronized int get() throws InterruptedException {
        while (elem == null) {
            waitedConsumers++;
            this.wait();
            waitedConsumers--;
        }
        Integer result = elem;
        elem = null;
        if (waitedProducers > 0) {
            this.notify();
        }
        return result;
    }

}
