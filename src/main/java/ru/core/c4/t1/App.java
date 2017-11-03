package ru.core.c4.t1;

public class App {
    public static void main(String[] args) {
        f(1);
    }

    private static void f(int i) {
        System.out.print(" " + i);
        if (i < 7) {
            f(i * 2);
        }
        System.out.print(" " + i);
    }
}
