package ru.core.io.t1;

import java.io.UnsupportedEncodingException;

public class App {
    public static void main(String[] args) throws UnsupportedEncodingException {
//        byte[] bytes = "п".getBytes("utf-8");
//        System.out.println(Arrays.toString(bytes));
//        byte[] bytes2 = "d".getBytes("UTF-16");
//        System.out.println(Arrays.toString(bytes2));
//
//        System.out.println("ы".getBytes("UTF-8").length);
//        System.out.println("ы".getBytes("latin1").length);

//        char ch;
//        ch=0x0001;
//        System.out.println(Arrays.toString(("" + ch).getBytes("UTF-8")));
//
//        ch=0x0111;
//        System.out.println(Arrays.toString(("" + ch).getBytes("UTF-8")));
//
//        ch=0x1111;
//        System.out.println(Arrays.toString(("" + ch).getBytes("UTF-8")));

        char ch=55378;
        char ch2=56816;

        String s= new String(new char[]{ch,ch2});

        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.codePointCount(0,2));
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
    }
}
