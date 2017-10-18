package ru.n2.t21;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
//        new A();
//        new B();
//        new C(3);
//        new D();
//        new D(34);

        Class[] classes={A.class,B.class,C.class,D.class};
        for (Class aClass:classes){
            Constructor[] c=aClass.getDeclaredConstructors();
            System.out.println(Arrays.toString(c));
        }
    }
}
