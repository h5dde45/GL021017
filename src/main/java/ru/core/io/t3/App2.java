package ru.core.io.t3;

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class App2 {
    public static void main(String[] args) throws IOException {
        DataOutputStream out = new DataOutputStream(new GZIPOutputStream(
                new BufferedOutputStream(new FileOutputStream(new File(
                "C:\\java_projects\\july2017\\GL021017\\src\\main\\java\\ru\\core\\io\\t3\\App.txt")),
                        256)));

        for (int i = 0; i < 1000; i++) {
            out.writeDouble(123.456);
        }

        out.flush();
        out.close();

        DataInputStream in = new DataInputStream(new GZIPInputStream(new FileInputStream(new File(
                "C:\\java_projects\\july2017\\GL021017\\src\\main\\java\\ru\\core\\io\\t3\\App.txt"))));

        for (int i = 0; i < 1000; i++) {
            System.out.println(in.readDouble());
        }

    }
}
