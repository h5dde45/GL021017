package ru.core.c4.t2;

public class Fbn {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i+" = "+fib(i));
//        }
        fib(5);
    }

    private static int fib(int i) {
//        if(i==0){
//            return 0;
//        }
//        if (i==1){
//            return 1;
//        }
        int result = i < 1 ? 0 : (i < 2 ? 1 : fib(i - 2)+m(i) + fib(i - 1));
//        System.out.print(" " + i);
        return result;
    }

    private static int m(int i) {
        System.out.print(" "+i);
        return 0;
    }
}
