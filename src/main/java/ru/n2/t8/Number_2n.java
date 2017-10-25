package ru.n2.t8;

public class Number_2n implements Runnable{
    @Override
    public void run() {
        System.out.println("Start thread...");

        for (int i = 0; i < 2; i++) {
            try {
                Thread.sleep(500);
                System.out.println("pre="+i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            new Thread(new Number_2n()).start();
            try {
                Thread.sleep(500);
                System.out.println("post="+i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

//        try {
//            Thread.sleep(1002);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("End thread...");
    }
}
