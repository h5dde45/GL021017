package ru.av.p7;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Demo {

    public static void main(String[] args) throws IOException {
        Path dir= Paths.get("C:/3/demo3");
        long count= Files.walk(dir)
        .filter(p->p.toString().endsWith(".xml"))
        .peek(System.out::println)
        .flatMap(p -> {
            try {
                return Files.lines(p);
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }).filter(s->s.contains("java"))
                .peek(System.out::println)
        .count()
        ;

        System.out.println(count);

    }

}
