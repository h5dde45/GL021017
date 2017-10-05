package ru.t8;

public class TE_4a {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 3; i++) {

            Runnable a = new PrintRunnable("a *", 71);
            Thread threadA = new Thread(a);
            threadA.start();

            Runnable b = new PrintRunnable("* b", 70);
            Thread threadB = new Thread(b);
            threadB.start();

            threadA.join();
            threadB.join();

            System.out.println("==================");
            Runnable c = new PrintRunnable("c", 100);
            c.run();

            System.out.println("+++++++++++");

        }
    }
}
