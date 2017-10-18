package ru.n2.t19.labs.lab3;

import java.util.Set;
import java.util.TreeSet;

public class Start {
    public static void main(String[] args) {
        Set<User> set=new TreeSet<>(new UserComparator());
        set.add(new User(34,"орва"));
        set.add(new User(234,"тгвк"));
        set.add(new User(234,null));
        set.add(new User(73114,"дщ"));
        set.add(new User(364,"ыцу"));
        set.add(new User(364,null));
        set.add(new User(734,"дщ"));
        set.add(new User(64,"ыцу"));


        System.out.println(set);
    }
}
