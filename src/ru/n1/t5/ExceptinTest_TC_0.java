package ru.n1.t5;

public class ExceptinTest_TC_0 {
    public static void main(String[] args) {
        try {
            System.out.println(0);
            throw new RuntimeException();
        } catch (RuntimeException e) {
            System.out.println(1);
        }
        System.out.println(2);
    }
}
