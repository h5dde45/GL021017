package ru.n2.t17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestListGetlast {
    public static void main(String[] args) {
        long t0, t1;
        List<String> list;

        list = new ArrayList<>();
        for (int i = 0; i < 10_000; i++) {
            list.add(""+i);
        }
        t0=System.currentTimeMillis();
        testListGet(list);
        t1=System.currentTimeMillis();
        System.out.println("arrayList: "+(t1-t0));

        list = new LinkedList<>();
        for (int i = 0; i < 10_000; i++) {
            list.add(""+i);
        }
        t0=System.currentTimeMillis();
        testListGet(list);
        t1=System.currentTimeMillis();
        System.out.println("LinkedList: "+(t1-t0));
    }

    private static void testListGet(List<String> list) {
        int size=list.size();
        for (int i = 0; i < 100_000; i++) {
            String s=list.get(size/2);
        }
    }

}
