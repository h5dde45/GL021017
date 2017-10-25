package ru.n1.t8;

public class ThreadExample_0 {
//    public static void main(String[] args) throws InterruptedException {
//        for (int i = 0; i <10; i++) {
//            Thread.sleep(240);
//            System.out.println("a");
//            f();
//        }
//    }
//
//    private static void f() throws InterruptedException {
//        Thread.sleep(260);
//        System.out.println("b");
//    }

    public static void main(String[] args) throws InterruptedException {
//        for (int i = 0; i < 10; i++) {
//            Thread.sleep(240);
//            System.out.println("a");
//        }
//        new PrintRunnable(" b",260).run();
//        new PrintRunnable(" c",260).run();

        Runnable printer=new PrintRunnable(" b",200);
        Thread thread=new Thread(printer);
        thread.start();


        for (int i = 0; i < 10; i++) {
            Thread.sleep(100);
            System.out.println("a");
        }

        System.out.println("start join Main");
        thread.join();
        System.out.println("finish Main");
    }

}
