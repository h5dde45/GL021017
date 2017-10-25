package ru.sl.p26;

public class InnerClass {
    public static void main(String[] args) {
        Outer outer=new Outer();
        outer.test();
        System.out.println("---------");
        outer.test2();
        System.out.println("-----");
        Outer.Inner inner=new Outer().new Inner();
        inner.disptay();
        System.out.println("--------------");


    }
}
