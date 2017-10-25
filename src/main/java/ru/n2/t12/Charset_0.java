package ru.n2.t12;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.SortedMap;

public class Charset_0 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        SortedMap<String, Charset> charsetMap = Charset.availableCharsets();
//        for (String s : charsetMap.keySet()) {
//            System.out.println(s);
//        }

        byte[]bytes=new byte[256];
        for (int i = 0; i < 256; i++) {
            bytes[i]= (byte) (i-128);
        }

        for (String s:Charset.availableCharsets().keySet()){
            System.out.println(s);
            System.out.println(new String(bytes,s));
            System.out.println();
            System.out.println();
        }

    }
}
