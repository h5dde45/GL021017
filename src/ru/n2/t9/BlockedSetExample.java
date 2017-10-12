package ru.n2.t9;

public class BlockedSetExample {
    public static void main(String[] args) {
//        BlockedSetExample ref=new BlockedSetExample();
//        for (int i = 0; i < 5; i++) {
//            new Thread(new BlockedMethodCaller(ref,i)).start();
//        }

//        for (int i = 0; i < 5; i++) {
//            new Thread(new BlockedMethodCaller(new BlockedSetExample(),i)).start();
//        }
//    }
//    public synchronized void f(int k) throws InterruptedException {
//        System.out.println("+"+k);
//        Thread.sleep(1000);
//        System.out.println("-"+k);
//    }
        BlockedSetExample be=new BlockedSetExample();
        for (int i = 0; i < 5; i++) {
            new Thread(new BlockedMethodCaller(be,i)).start();
        }
    }
    public synchronized void f(int k) throws InterruptedException {
        System.out.println("+"+k);
        this.wait(1111);
        System.out.println("-"+k);
    }
}
