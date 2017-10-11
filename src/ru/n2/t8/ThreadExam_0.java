package ru.n2.t8;

public class ThreadExam_0 {
    public static void main(String[] args) throws InterruptedException {

        PrintRunnable printRunnable = new PrintRunnable(" c", 300);
        Thread thread = new Thread(printRunnable);
        thread.start();

        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 2_000_000_000L; j++) {}
            Thread.sleep(200);
            System.out.println("a");
//            f();
        }

        System.out.println("----");
        thread.join();
        System.out.println("----");

        System.out.println("main");

    }

    private static void f() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println(" b");
    }
}
