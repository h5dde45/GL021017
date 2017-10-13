package ru.n2.t9.labs.lab_1;

public class Buffer_1 {
    private Integer elem = null;
    private int waitedProducers = 0;
    private int waitedConsumers = 0;

    public synchronized void put(Integer elem) throws InterruptedException {
        System.out.println("start put -> "+this.elem);
        while (this.elem != null) {
            waitedProducers++;
            System.out.println("waitedProducers++; elem = "+this.elem);
            this.wait();
            waitedProducers--;
            System.out.println("waitedProducers--; elem = "+this.elem);
        }
        this.elem = elem;
        if (waitedConsumers > 0) {
            System.out.println("waitedConsumers > 0");
            this.notify();
        }
        System.out.println("end put -> "+this.elem);
    }

    public synchronized Integer get() throws InterruptedException {
        System.out.println("start get -> "+elem);
        while (elem == null) {
            waitedConsumers++;
            System.out.println("waitedConsumers++; elem = "+this.elem);
            this.wait();
            waitedConsumers--;
            System.out.println("waitedConsumers--; elem = "+this.elem);
        }
        Integer result = this.elem;
        this.elem = null;
        if (waitedProducers > 0) {
            System.out.println("waitedProducers > 0");
            this.notify();
        }
        System.out.println("end get -> "+elem);
        return result;
    }
}
