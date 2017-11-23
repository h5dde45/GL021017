package ru.core.coll.t1;

import java.util.Collection;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
//        Collection<String> a=new ArrayList<>();
//        Collection<String> a=new HashSet<>();
        Collection<String> a=new TreeSet<>();
        a.add("q");
        a.add("f");
        a.add("4");
        System.out.println(a);

//        Collection<String> b=new ArrayList<>(a);
//        Collection<String> b=new HashSet<>(a);
        Collection<String> b=new TreeSet<>(a);
        b.add("F");
        b.addAll(a);
        b.add("v");
        b.add("f");
        System.out.println(b);

    }
}
