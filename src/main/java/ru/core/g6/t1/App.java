package ru.core.g6.t1;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        int area = 0;
        try {
            area = f(12, 3);
            System.out.println(area);
        } catch (Exception e) {
            System.err.println("bad argument");
        }
        System.out.println("next");

        for (int i = 0; i < 2; i++) {
            f2();
            System.err.println();
        }

        while (area!='q'){
            area =System.in.read();
            System.out.print((char) area);
        }
    }

    private static void f2() {
        for (int i = 0; i < 2; i++) {
            System.err.print(0);
//            if (true)continue;
//            if (true)break;
            if (true)return;
//            if (true)throw new Error();
            System.err.print(1);
        }
        System.err.println(2);
    }

    private static int f(int i, int i1) {
        if (i < 0 || i1 < 0) {
            throw new IllegalArgumentException("===="+i+"==="+i1);
        }
        return i * i1;
    }
}
