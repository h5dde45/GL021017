package ru.n2.t19;

import java.util.SortedSet;
import java.util.TreeSet;

public class ComparableString_0 {
    public static void main(String[] args) {
//        SortedSet<String> set=new TreeSet<>();
//        set.add("c");
//        set.add("ba");
//        set.add("b");
//        System.out.println(set);

//        SortedSet<Integer> set=new TreeSet<>();
//        set.add(45);
//        set.add(3);
//        set.add(12);
//        System.out.println(set);

        SortedSet<User> set=new TreeSet<>();
        set.add(new User(34,"r"));
        set.add(new User(4,"j"));
        set.add(new User(14,"x"));
        System.out.println(set);
    }
}
