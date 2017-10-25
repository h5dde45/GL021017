package ru.n1.t9;

public class SimpleEx {
    public static void main(String[] args) {
        SimpleExBuf buf=new SimpleExBuf();
        new Thread(new Produced(1,1000,buf)).start();
        new Thread(new Consumer(buf)).start();
    }
}
