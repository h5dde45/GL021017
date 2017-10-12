package ru.n2.t8;

public class ThreadEx_4 {
    public static void main(String[] args) throws InterruptedException {

        Runnable printA=new PrintRunnable("a",333);
        Thread threadA=new Thread(printA);
        threadA.start();

        Runnable printB=new PrintRunnable(" b",555);
        Thread threadB=new Thread(printB);
        threadB.start();

        System.out.println("====a====");
        threadA.join();
        System.out.println("====a===");

        System.out.println("====b====");
        threadB.join();
        System.out.println("====b===");

        System.out.println("main");

    }
}
