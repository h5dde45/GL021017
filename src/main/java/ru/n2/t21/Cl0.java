package ru.n2.t21;

public class Cl0 {
    public static void main(String[] args) {
        Class<Cl0> clazz=Cl0.class;
        System.out.println(clazz.getSuperclass());
        System.out.println(Object.class.getSuperclass());

        String s=new Cl0().toString();
        int hash=s.hashCode();
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        boolean b=new Cl0().equals(null);
        System.out.println(s);
        System.out.println(hash);
        System.out.println(b);
    }
}
