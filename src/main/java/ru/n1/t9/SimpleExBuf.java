package ru.n1.t9;

public class SimpleExBuf {
    private Integer elem = null;

    public synchronized void put(Integer newElem) throws InterruptedException {
        while (elem != null) {
            this.wait();
        }
        this.elem = newElem;
        this.notifyAll();
    }

    public synchronized Integer get() throws InterruptedException {
        while (elem == null) {
            this.wait();
        }
        int result = this.elem;
        this.elem = null;
        this.notifyAll();
        return result;
    }

}
