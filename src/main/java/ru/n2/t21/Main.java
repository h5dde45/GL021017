package ru.n2.t21;

import java.util.ArrayList;
import java.util.List;

public class Main {
        List<Integer> integerList = new ArrayList<>();

    public boolean add(Integer integer) {
        return integerList.add(integer);
    }

    public boolean remove(Object o) {
        return integerList.remove(o);
    }

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);

        List<String> strList = new ArrayList<>();
        strList.add("o");


    }
}
