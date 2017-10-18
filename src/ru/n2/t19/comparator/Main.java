package ru.n2.t19.comparator;

import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
//        SortedSet<User> set=new TreeSet<>(new UserAgeComparator());
        SortedSet<User> set=new TreeSet<>(new UserNameComparator());
        set.add(new User(34,"rw"));
        set.add(new User(4,"j"));
        set.add(new User(14,"x"));
        System.out.println(set);
    }
}
