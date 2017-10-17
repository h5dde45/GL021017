package ru.n2.t18;

import java.util.HashMap;

public class TestPut {

    public static final int INITIAL_CAPACITY = 16*16*16*16*16;

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>(INITIAL_CAPACITY, 1);
        for (int i = 0; i < INITIAL_CAPACITY - 5; i++) {
            map.put(i, null);
        }

        for (int i = 1; i < 10; i++) {
            long to = System.nanoTime();
            map.put(-i, null);
            long t1 = System.nanoTime();
            System.out.println(t1 - to);

        }
    }
}
