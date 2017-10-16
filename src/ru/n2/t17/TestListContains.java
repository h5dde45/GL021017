package ru.n2.t17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestListContains {
    public static void main(String[] args) {
        long t0, t1;
        List<String> list;

        list = new ArrayList<>();
        for (int i = 0; i < 10_000; i++) {
            list.add(""+i);
        }
        t0=System.currentTimeMillis();
        testListContains(list);
        t1=System.currentTimeMillis();
        System.out.println("arrayList: "+(t1-t0));

        list = new LinkedList<>();
        for (int i = 0; i < 10_000; i++) {
            list.add(""+i);
        }
        t0=System.currentTimeMillis();
        testListContains(list);
        t1=System.currentTimeMillis();
        System.out.println("linkedList: "+(t1-t0));


    }

    private static void testListContains(List<String> list) {
        for (int i = 0; i < 100_000; i++) {
            list.contains("xyz");
        }
    }

}
