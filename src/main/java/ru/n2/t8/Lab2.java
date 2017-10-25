package ru.n2.t8;

public class Lab2 {
    public static void main(String[] args) throws InterruptedException {

        Coordinator coordinator = new Coordinator();
        Thread thread = new Thread(coordinator);
        thread.start();

//        thread.join();
        System.out.println("end main");
    }
}
