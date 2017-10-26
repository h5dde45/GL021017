package ru.av.p2;

public class Main {
    public static void main(String[] args) {
        NewInteger integer = new NewInteger(20);

        System.out.println(integer.getValue());
        System.out.println(integer);
        System.out.println(NewInteger.MAX_VALUE);
        System.out.println(NewInteger.MIN_VALUE);

    }
}
