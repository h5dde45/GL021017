package ru.sl.p3;

public class InternAndCompar {
    public static void main(String[] args) {
        String sPool="asd";
        String str=new String("asd");
        StringBuffer sbf=new StringBuffer("asd");
        StringBuilder sbd=new StringBuilder("asd");
        sbf.hashCode();

        System.out.println(sPool==str);
        str=str.intern();
        System.out.println(sPool==str);

        System.out.println(str.equals(sbf));
        System.out.println(str.equals(sbf.toString()));
        System.out.println(sbf.equals(sbd));
        System.out.println(sbf.toString().equals(sbf.toString()));
        System.out.println(str.contentEquals(sbf));
    }
}
