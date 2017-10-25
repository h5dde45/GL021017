package ru.n2.t2;

public class RP3 {
    public static void main(String[] args) {
        System.out.println("="+f(7));
    }

    private static int f(int i) {
        if(i<2){
            return abc(i);
        }
            return a(i)+f(i-2)+b(i)+f(i-1)+c(i);

    }

    private static int a(int i) {
        System.out.print("(");
        return 0;
    }

    private static int b(int i) {
        System.out.print("+");
        return 0;
    }

    private static int c(int i) {
        System.out.print(")");
        return 0;
    }

    private static int abc(int i) {
        System.out.print(i);
        return i;
    }

}
