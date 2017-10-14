package ru.n2.t10;

public class InterruptExmpl {
    public static void main(String[] args) throws InterruptedException {
//        Thread thread=new Thread(new Runnable() {
//            @Override
//            public void run() {
//                Thread myThread=Thread.currentThread();
//                while (true){
////                    System.out.println(myThread.isInterrupted());
//                    System.out.println(Thread.interrupted());
//                    for (int i = 0; i < 1_000_000_000L; i++) {
//
//                    }
//                }
//            }
//        });
//        Thread thread2=new Thread(new Runnable() {
//            @Override
//            public void run() {
//                Thread myThread=Thread.currentThread();
//                while (!myThread.isInterrupted()){
//                    System.out.println("====");
//                    for (int i = 0; i < 1_000_000_000L; i++) {
//
//                    }
//                }
//            }
//        });
//        thread2.start();
//        Thread.sleep(1111);
//        thread2.interrupt();

//        Thread.currentThread().interrupt();
//
//        try {
//            Thread.sleep(Integer.MAX_VALUE);
//        } catch (InterruptedException e) {
//            System.out.println("Interrupted exception");
//        }

//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    System.out.println("will sleep");
//                    Thread.sleep(Long.MAX_VALUE);
//                } catch (InterruptedException e) {
//                    System.out.println("woke up on exception");
//                }
//            }
//        });
//        thread.start();
//        Thread.sleep(3333);
//        System.out.println("wake up");
//        thread.interrupt();
//
//    }

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    System.out.println("==");
                    for (int i = 0; i < 1_000_000_000L; i++) {

                    }
                }
            }
        });
        thread.start();
        Thread.sleep(3333);
        thread.destroy();

    }
}
