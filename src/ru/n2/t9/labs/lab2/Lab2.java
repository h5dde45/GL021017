package ru.n2.t9.labs.lab2;

public class Lab2 {
    public static void main(String[] args) {
        Buffer_2 buffer = new Buffer_2();
        new Thread(new Producer(1, 1000, buffer)).start();
//        new Thread(new Producer(101, 1000, buffer)).start();
        new Thread(new Consumer(buffer)).start();
    }
}
