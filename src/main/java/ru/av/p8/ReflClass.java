package ru.av.p8;

public class ReflClass {
    public static void main(String[] args) throws ClassNotFoundException {

        ReflClass rf=new ReflClass();
        Class c1=rf.getClass(); //to the object

        Class c2=ReflClass.class;//to the literal(use the keyword - class )

        Class c3=String[].class;
        Class c4=int.class;

        Class c5=Class.forName("java.lang.Integer");//to the name

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
    }
}
