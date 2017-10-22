package ru.sl.p1;

public class VarargsD {

    public static void main(String[] args) {
        fly(1, 2, 3);
        fly("===",1, 2, 3);
        fly(new int[]{1, 2, 3});
        fly();
    }

    private static void fly(int... ints) {
        System.out.println(ints.length);
    }
//    private static void fly(int i,int... ints) {
//        System.out.println(ints.length);
//    }
//    private static void fly(boolean...b) {
//    }

    private static void fly(String s, int... ints) {
        System.out.println(s + " = " + ints.length);
    }

}
