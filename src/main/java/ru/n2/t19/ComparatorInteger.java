package ru.n2.t19;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class ComparatorInteger  {
    public static void main(String[] args) {
        SortedSet<Integer> set=new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return (o1%10)-(o2%10);
            }
        });

        set.add(345);
        set.add(3452);
        set.add(3458);
        set.add(34557);

        System.out.println(set);

        NavigableSet<Integer> set1= (NavigableSet<Integer>) set.tailSet(344536);
        System.out.println(set1);
    }
}
