package ru.n2.t19;

import java.util.NavigableSet;
import java.util.TreeSet;

public class SortedSetTail {
    public static void main(String[] args) {
        NavigableSet<String> set=new TreeSet<>();
        set.add("ea");
        set.add("hea");
        set.add("gea");
        set.add("yuea");
        set.add("kea");

        System.out.println(set);

        NavigableSet<String> set2=set.tailSet("i",true);
        System.out.println(set2);

        NavigableSet<String> set3=set.tailSet("gea",false);
        System.out.println(set3);

        NavigableSet<String> set4=set.subSet("ea",false,"o",true);
        System.out.println(set4);


    }
}
