package ru.n2.t19;

import java.util.*;

public class Class_1 {
    public static void main(String[] args) {
        Random random = new Random();
        NavigableSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < 100; i++) {
            set.add(random.nextInt(1000));
        }

        System.out.println(set.size());

        for (int i = 0; i < 10; i++) {
            int fromElement = 100 * i;
            int toElement = 100 * (i + 1);

            NavigableSet<Integer> subSet = set.subSet(fromElement, true, toElement, false);
            System.out.println(fromElement + " ... " + toElement +
                    " = " + subSet.size() + " => " + subSet);
        }

        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < 10; i++) {
            int fromElement = 100 * i;
            int toElement = 100 * (i + 1);
            NavigableSet<Integer> subSet = set.subSet(fromElement, true, toElement, false);
            map.put(i+1,subSet.size());
        }
        System.out.println(map);

    }
}
