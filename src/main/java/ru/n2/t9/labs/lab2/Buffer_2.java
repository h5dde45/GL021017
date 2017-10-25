package ru.n2.t9.labs.lab2;

public class Buffer_2 {
    private Integer elem = null;

    public synchronized void put(Integer elem) throws InterruptedException {
        System.out.println("start put = "+elem);
        while (this.elem != null) {
            System.out.println("put preWait...");
            this.wait();
            System.out.println("put postWait...");
            if(this.elem!=null){
                this.notify();
            }
        }
        this.elem = elem;
            this.notify();
        System.out.println("end put = "+elem);
    }

    public synchronized Integer get() throws InterruptedException {
        System.out.println("start get = "+elem);

        while (elem == null) {
            System.out.println("get preWait...");
            this.wait();
            System.out.println("get postWait...");
            if(this.elem==null){
                this.notify();
            }
        }
        Integer result = this.elem;
        this.elem = null;
            this.notify();
        System.out.println("end get = "+elem);

        return result;

    }
}
