package ru.core.mt.p4;

public class ProducerConsumerExample {
    public static void main(String[] args) {
        SingleElementBuffer buffer=new SingleElementBuffer();
        new Thread(new Producer(1,1000,buffer)).start();
        new Thread(new Consumer(buffer)).start();

    }
}
