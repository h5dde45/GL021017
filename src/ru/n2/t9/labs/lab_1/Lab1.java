package ru.n2.t9.labs.lab_1;


public class Lab1 {
    public static void main(String[] args) {
        Buffer_1 buffer = new Buffer_1();
        new Thread(new Producer(1, 1000, buffer)).start();
//        new Thread(new Producer(101, 1000, buffer)).start();
        new Thread(new Consumer(buffer)).start();
    }
}
