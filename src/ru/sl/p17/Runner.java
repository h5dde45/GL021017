package ru.sl.p17;

import java.io.InvalidObjectException;

public class Runner {
    public static void main(String[] args) {

        Stud stud = new Stud("first", "vp", 34, "asd");
        System.out.println(stud);

        String fil = "C:\\java_projects\\july2017\\GL021017\\src\\ru\\sl\\p17\\demo.data";
        Serializator sz = new Serializator();
        System.out.println(sz.serialization(stud, fil));

        Stud.facult = "second";

        Stud result = null;

        try {
            result=sz.deSerialization(fil);
        } catch (InvalidObjectException e) {
            e.printStackTrace();
        }
        System.out.println(result);

    }
}
