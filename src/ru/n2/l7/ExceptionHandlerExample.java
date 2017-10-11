package ru.n2.l7;

public class ExceptionHandlerExample {
    public static void main(String[] args) {
        System.out.println(add("2", "45"));
        System.out.println(add("2r", "4 5"));
    }

    private static int add(String s, String s1) {
        int a;
        int b;

        try {
            a = Integer.valueOf(s);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Try to add two numbers ('" + s +
                    "' + '" + s1 + "') but first argument is not correct");
        }
        try {
            b = Integer.valueOf(s1);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Try to add two numbers ('" + s +
                    "' + '" + s1 + "') but second argument is not correct");
        }
        return a + b;
    }
}
