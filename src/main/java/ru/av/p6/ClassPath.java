package ru.av.p6;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ClassPath {
    public static void main(String[] args) throws IOException {
        Path path= Paths.get(
                "\\java_projects\\july2017\\GL021017\\src\\main\\java\\ru\\av\\p6\\Main.java");
        Path dir= Paths.get(
                "\\java_projects\\july2017\\GL021017\\src\\main\\java\\ru\\av");

        System.out.println(path.isAbsolute());
        System.out.println(path.toString());
        System.out.println(path.getFileName());
        System.out.println(path.getParent());
        System.out.println(path.getNameCount());
        System.out.println(path.getName(3));

        System.out.println("======");
        System.out.println(Files.exists(path));
        System.out.println(Files.isRegularFile(path));
        System.out.println(Files.isReadable(path));
        System.out.println(Files.size(path));
        System.out.println(Files.getLastModifiedTime(path).toMillis());

        System.out.println("======");
        System.out.println(Files.exists(dir));
        System.out.println(Files.isDirectory(dir));

        try (DirectoryStream<Path> stream=Files.newDirectoryStream(dir)){
            for (Path path1:stream){
                System.out.println(path1);
            }
        }
    }
}
