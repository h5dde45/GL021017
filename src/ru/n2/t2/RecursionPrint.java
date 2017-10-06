package ru.n2.t2;

public class RecursionPrint {
    private static int depth;

    public static void main(String[] args) {
        f(1);
    }

//    private static void f(int i) {
//        System.out.print(" " + i);
//        if(i<129){
//            f(i*2);
//        }
//        System.out.print(" " + i);
//    }

    private static void f(int i) {
        in(i);
        if (check(i)) {
            f(i * 2);
        }
        out(i);
    }

    private static void out(int i) {
        depth--;
        spaces();
        System.out.println("<-(" + i + ")");
    }

    private static boolean check(int i) {
        spaces();
        System.out.println(i + " < 129 = "+(i<129));
        return i < 129;
    }

    private static void in(int i) {
        spaces();
        System.out.println("(" + i + "->)");
        depth++;
    }

    private static void spaces() {
        for (int i = 0; i < depth; i++) {
            System.out.print(" ");
        }
    }
}
