package ru.n2.t9;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Object ref = new Object();
        Object ref1 = new Object();
        synchronized (ref) {
            synchronized (ref1) {
                ref.wait(3333);
            }
        }
    }
}
