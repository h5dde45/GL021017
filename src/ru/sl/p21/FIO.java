package ru.sl.p21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FIO {
    public static void main(String[] args) {
        String fileIn = "C:\\java_projects\\july2017\\GL021017\\src\\ru\\sl\\p21\\in.txt";
        String fileOut = "C:\\java_projects\\july2017\\GL021017\\src\\ru\\sl\\p21\\out.txt";

        try (FileInputStream fis = new FileInputStream(fileIn);
             FileOutputStream fos = new FileOutputStream(fileOut)) {
            int s = fis.read();
            while (s != -1) {
                System.out.print(" "+s);
                fos.write(s);
                s = fis.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
