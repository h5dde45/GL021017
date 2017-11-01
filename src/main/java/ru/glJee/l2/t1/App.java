package ru.glJee.l2.t1;

import java.util.function.Consumer;

import static java.util.Arrays.*;

public class App {
    public static void main(String[] args) {

        Consumer<String> println0=System.out::println;
        Consumer<String> println1=s -> System.out.println(s);
        Consumer<String> println2=new Consumer<String>() {
            int anInt=0;
            @Override
            public void accept(String s) {
                System.out.println(s+" = "+anInt++);
            }

            @Override
            public String toString() {
                return "$classname{" +
                        "anInt=" + anInt +
                        '}';
            }
        };

        println2.accept("sedwe");
        println2.accept("sedwwrwe");

        asList("aa","b","ccc").stream()
                .filter(s -> s.length()>1)
                .map(String::length)
                .forEach(System.out::println);
    }
}
