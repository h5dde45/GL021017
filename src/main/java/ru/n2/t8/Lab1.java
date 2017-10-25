package ru.n2.t8;

public class Lab1 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 2; i++) {
            PrintRunnable pA = new PrintRunnable("A *", 200);
            Thread threadA = new Thread(pA);
            threadA.start();
            PrintRunnable pB = new PrintRunnable("* B", 201);
            Thread threadB = new Thread(pB);
            threadB.start();

            threadA.join();
            threadB.join();

            PrintRunnable pC=new PrintRunnable(" C",333);
            Thread threadC = new Thread(pC);
            threadC.start();

            threadC.join();

        }
    }
}