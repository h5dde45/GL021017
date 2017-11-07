package ru.core.g6.t3;

public class Main {
    public static void main(String[] args) {
        System.out.println(0);
        try {
            System.out.println(1);
            if (true) throw new Error();
        } finally {
            System.out.println(2);
            if (true) return; //throw new RuntimeException();
        }
        System.out.println(4);

    }
}
