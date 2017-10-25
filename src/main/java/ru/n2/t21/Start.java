package ru.n2.t21;

import java.awt.*;
import java.util.HashMap;

public class Start {
//    public int iCopy=getI();
//    public int i=1;

    public static void main(String[] args) {
//        new A();
//        new B();
//        new C(3);
//        new Dog();
//        new Dog(34);

//        Class[] classes={A.class,B.class,C.class,Dog.class};
//        for (Class aClass:classes){
//            Constructor[] c=aClass.getDeclaredConstructors();
//            System.out.println(Arrays.toString(c));
//        }
//
//        Start o=new Start();
//        System.out.println(o.i);
//        System.out.println(o.iCopy);

     printAsBinary(100);
     printAsBinary(new int[]{23,65,32});
        System.out.println();
     print("=====");
     print(new Point(2,34));
     print(new HashMap<>());

    }

    private static void print(Object o) {
        String s= (o==null)? "null": o.toString();
        System.out.println(s);
    }

    private static void printAsBinary(int[] ints) {
        for (int i:ints){
            System.out.print(Integer.toBinaryString(i)+" ");
        }
    }

    private static void printAsBinary(int i) {
        System.out.println(Integer.toBinaryString(i));
    }

//    public int getI() {
//        return i;
//    }
}
