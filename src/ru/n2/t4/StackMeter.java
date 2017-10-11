package ru.n2.t4;

public class StackMeter {
    static int counter_0 = 0;
    static int counter_1 = 0;

    public static void main(String[] args) {

        try {
            test_0();
        } catch (StackOverflowError e) {

        }
        System.out.println(counter_0);

        try {
            test_1();
        } catch (StackOverflowError e) {

        }
        System.out.println(counter_1);


    }

    private static void test_0() {
        counter_0++;
        test_0();
    }

    private static void test_1() {
        long l0 = 0;
        long l1 = 0;
        long l2 = 0;
        long l3 = 0;
        long l4 = 0;
        long l5 = 0;
        long l6 = 0;
        long l7 = 0;
        long l8 = 0;
        long l9 = 0;
        counter_1++;
        test_1();
    }
}
