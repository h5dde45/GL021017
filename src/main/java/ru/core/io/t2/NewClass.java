package ru.core.io.t2;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class NewClass {
    public static void main(String[] args) throws FileNotFoundException {
        OutputStream out = new FileOutputStream("===");
        OutputStream outBuff=new BufferedOutputStream(out,64*1024);

    }
}
