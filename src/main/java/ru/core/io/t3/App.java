package ru.core.io.t3;

import java.io.CharArrayReader;
import java.io.IOException;
import java.io.Reader;

public class App {
    public static void main(String[] args) throws IOException {
//        ByteArrayOutputStream buff=new ByteArrayOutputStream();
//        for (int i = 0; i < 10; i++) {
//            buff.write(new byte[]{0,1,2});
//        }
//        byte[] bytes = buff.toByteArray();
//        System.out.println(Arrays.toString(bytes));
//        Writer stringWriter = new StringWriter();
//        for (int i = 0; i < 3; i++) {
//            stringWriter.write(new char[]{'в', 'м', 'п'});
//        }
//        System.out.println(stringWriter);
//        CharArrayWriter buff = new CharArrayWriter();
//        for (int i = 0; i < 3; i++) {
//            buff.write(new char[]{'в', '4', 'п'});
//        }
//        char[] chars = buff.toCharArray();
//        int[]ints={2,3,4};
//        System.out.println(Arrays.toString(chars));
//        System.out.println(chars);

        char[] charBuff = {'d', 'f', 'h', 'j'};

        f(new CharArrayReader(charBuff));

    }

    private static void f(Reader reader) throws IOException {
        int ch;
        while ((ch = reader.read()) != -1) {
            System.out.print((char) ch);
        }
    }
}
