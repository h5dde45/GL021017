package ru.sl.p21;

import java.io.*;

public class WriteArr {
    public static void main(String[] args) {
        String[] s={"нов"," asd"," qwe"};

        File fByte=new File(
                "C:\\java_projects\\july2017\\GL021017\\src\\ru\\sl\\p21\\fByte.data");
        File fSymbol=new File(
                "C:\\java_projects\\july2017\\GL021017\\src\\ru\\sl\\p21\\fSymbol.txt");


        try (FileOutputStream outputStream= new FileOutputStream(fByte);
             FileWriter writer=new FileWriter(fSymbol)){
            for (String s1:s){
                outputStream.write(s1.getBytes());
                writer.write(s1);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
