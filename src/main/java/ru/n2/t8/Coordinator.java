package ru.n2.t8;

public class Coordinator implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            PrintRunnable pA = new PrintRunnable("A * ", 200);
            Thread threadA = new Thread(pA);
            threadA.start();
            PrintRunnable pB = new PrintRunnable(" * B", 201);
            Thread threadB = new Thread(pB);
            threadB.start();

            try {
                threadA.join();
                threadB.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            PrintRunnable pC=new PrintRunnable(" C",333);
            Thread threadC = new Thread(pC);
            threadC.start();

            try {
                threadC.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("end coordinator");
    }
}
