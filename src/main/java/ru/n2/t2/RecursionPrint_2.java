package ru.n2.t2;

public class RecursionPrint_2 {
    public static void main(String[] args) {
        f(5);
    }

    private static int f(int i) {
        System.out.print(" " + i);
        if (i == 0) {
            return 0;
        } else if (i == 1) {
            return 1;
        } else
            return f(i - 2) + f(i - 1);
    }
}
