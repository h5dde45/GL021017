package ru.glJee.l2.t1;

import static java.util.Arrays.*;

public class App {
    public static void main(String[] args) {



        asList("aa","b","ccc").stream()
                .filter(s -> s.length()>1)
                .map(String::length)
                .forEach(System.out::println);
    }
}
