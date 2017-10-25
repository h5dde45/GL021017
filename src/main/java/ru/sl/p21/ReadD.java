package ru.sl.p21;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadD {
    public static void main(String[] args) {
        String fileIn = "C:\\java_projects\\july2017\\GL021017\\src\\ru\\sl\\p21\\in.txt";

        int i;
        File file=new File(fileIn);
        try(FileReader reader=new FileReader(file)){
            while ((i=reader.read())!=-1){
                System.out.print(" "+ i);
//                System.out.println();
                System.out.print((char) i);
//                Thread.sleep(555);
            }
        } catch (IOException e) {
            e.printStackTrace();
//        } catch (InterruptedException ignored) {

        }


    }
}
