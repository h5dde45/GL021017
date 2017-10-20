package ru.n2.t24;

public class App_01 {
    private int field;
    private static int fieldStatic;

    class Inner {
        public Inner() {
            field = 1;
            fieldStatic = 1;
        }
    }
    static class Nested {
        public Nested() {
//            field = 1;
            fieldStatic = 1;
        }
    }
}

class ABC {
    public static void main(String[] args) {
        new App_01();
    }
}