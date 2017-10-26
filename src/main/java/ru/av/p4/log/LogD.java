package ru.av.p4.log;

import java.io.IOException;
import java.util.logging.*;

public class LogD {
    public static void main(String[] args) throws IOException {

        Logger logger=Logger.getLogger("ru.av.p4.log");
        logger.setLevel(Level.FINE);
        FileHandler fileHandler=new FileHandler(
                "C:\\java_projects\\july2017\\GL021017\\src" +
                        "\\main\\java\\ru\\av\\p4\\log\\log.txt");
        fileHandler.setFormatter(new XMLFormatter());
        logger.addHandler(fileHandler);

        new ClassA().doSomeThing();
        new ClassB().doSomeThingElse();
    }
}
