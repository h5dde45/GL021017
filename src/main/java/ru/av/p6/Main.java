package ru.av.p6;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        File file=new File(
        "\\java_projects\\july2017\\GL021017\\pom.xml");
        File dir=new File(
        "C:\\java_projects\\july2017\\GL021017\\src\\main\\java\\ru/av");

        System.out.println(file.isAbsolute());
        System.out.println(file.getPath());
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println("===============");

        System.out.println(file.getAbsolutePath());
        System.out.println(file.getCanonicalPath());

        System.out.println("===============");
        System.out.println(file.exists());
        System.out.println(file.canRead());
        System.out.println(file.length());
        System.out.println(file.lastModified());

        System.out.println("===============");
        System.out.println(dir.exists());
        System.out.println(dir.canRead());
        System.out.println(Arrays.toString(dir.list()));
        System.out.println(Arrays.toString(dir.listFiles()));



    }
}
