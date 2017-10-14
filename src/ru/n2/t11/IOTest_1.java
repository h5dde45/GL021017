package ru.n2.t11;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class IOTest_1 {
    public static void main(String[] args) throws IOException {
        InputStream inFile = new FileInputStream(
                "C:\\java_projects\\july2017\\GL021017\\src\\ru\\n2\\t11/text.txt");
        readFullyByByte(inFile);
        System.out.println("\n===============\n");

        InputStream inURL = new URL("https://yandex.ru/").openStream();
        readFullyByByte(inURL);
        System.out.println("\n===============\n");

        InputStream inArray = new ByteArrayInputStream(new byte[]{65, 66, 67, 68, 69});
        readFullyByByte(inArray);
        System.out.println("\n===============\n");


    }

    private static void readFullyByByte(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read();
            if (oneByte != -1) {
                System.out.print((char) oneByte);
            } else {
                System.out.println("\nend");
                break;
            }
        }
    }
}
