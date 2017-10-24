package ru.sl.p14;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RanAccessFileD {
    public static void main(String[] args) {

        String fpath = "C:\\java_projects\\july2017\\GL021017\\src\\ru\\sl\\p14\\raf.txt";

        try (
                RandomAccessFile fileR = new RandomAccessFile(fpath, "r");
                RandomAccessFile fileRW = new RandomAccessFile(fpath, "rw");
                RandomAccessFile fileRW1 = new RandomAccessFile(
                        "C:\\java_projects\\july2017\\GL021017\\src\\ru\\sl\\p14\\raf1.txt",
                        "rw")
        ) {
            String tmp = "";
            while ((tmp = fileR.readLine()) != null) {
                System.out.println(tmp);
            }
            System.out.println("+++++++++++++++++++");

            fileR.seek(3);
            byte[] bytes = new byte[12];
            fileR.read(bytes);
            System.out.println(new String(bytes));
            System.out.println("================");

            fileRW.seek(3);
            fileRW.write("*****".getBytes());

            fileRW1.seek(13);
            fileRW1.write("45y6grt*****".getBytes());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
