package ru.n2.t9;

public class SingleElementBuffer {
    private Integer elem=null;

    public synchronized Integer getElem() throws InterruptedException {
        while (elem==null){
            this.wait();
        }
        Integer result=this.elem;
        this.elem=null;
        this.notifyAll();
        return result;
    }

    public synchronized void setElem(Integer elem) throws InterruptedException {
        while (this.elem!=null){
            this.wait();
        }
        this.elem = elem;
        this.notifyAll();
    }
}
