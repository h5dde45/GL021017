package ru.core.io.t2;

import java.io.*;
import java.net.URL;

public class App2 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://yandex.ru/");

        try (
                InputStream in = url.openStream();
                OutputStream out = new FileOutputStream(
                new File("C:\\java_projects\\july2017\\GL021017\\src\\main\\java\\ru\\core\\io\\t2\\App2.html"));
        ) {
            copy(in, out);
        }
    }

    private static void copy(InputStream src, OutputStream dst) throws IOException {
        while (true) {
            int elem = src.read();
            if (elem != -1) {
                dst.write(elem);
            } else {
                break;
            }
        }
    }
}
