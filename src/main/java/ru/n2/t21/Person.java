package ru.n2.t21;

public class Person {

    public int a;
    public static int b;
    public int c;

    public Person() {
        a++;
        b++;
        c = b;

    }
}

class Test{
    public static void main(String[] args) {
        Person p0=new Person();
        System.out.println(p0.a+"."+p0.b+"."+p0.c);
        Person p1=new Person();
        System.out.println(p1.a+"."+p1.b+"."+p1.c);
        Person p2=new Person();
        System.out.println(p2.a+"."+p2.b+"."+p2.c);

        System.out.println(p0.a+"."+p0.b+"."+p0.c);
        System.out.println(p1.a+"."+p1.b+"."+p1.c);
        System.out.println(p2.a+"."+p2.b+"."+p2.c);

    }
}
