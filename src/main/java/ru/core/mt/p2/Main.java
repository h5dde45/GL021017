package ru.core.mt.p2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(new NewRunnable("new"));
        thread.start();
        Thread thread2=new Thread(new NewRunnable("  old"));
        thread2.start();
        thread.join();
        thread2.join();

        System.out.println("main");
    }
}
