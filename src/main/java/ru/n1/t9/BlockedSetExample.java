package ru.n1.t9;

public class BlockedSetExample {
    public static void main(String[] args) {
        BlockedSetExample ref=new BlockedSetExample();
        for (int i = 0; i < 5; i++) {
            new Thread(new BlockedMethodCaller(ref,i)).start();
        }
    }


    public synchronized void f(int i) throws InterruptedException {
        System.out.println("+ "+i);
        wait();
        System.out.println("- "+i);
    }
}
