package ru.core.io.t2;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class App {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://yandex.ru/");
        InputStream in = url.openStream();
        ByteArrayOutputStream buff = new ByteArrayOutputStream();

        copy(in, buff);

        byte[] rawData = buff.toByteArray();
        String html = new String(rawData, "utf-8");
        System.out.println(html);
    }

    private static void copy(InputStream src, OutputStream dst) throws IOException {
//        int elem ;
//
//        while ((elem = src.read())!=-1) {
//                dst.write(elem);
//        }
        byte[] buff = new byte[1024];
        int count;

        while ((count = src.read(buff)) != -1) {
            dst.write(buff,0,count);
        }
    }
}
