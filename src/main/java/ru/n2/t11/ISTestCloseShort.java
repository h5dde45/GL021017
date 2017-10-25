package ru.n2.t11;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class ISTestCloseShort {
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\java_projects\\july2017\\GL021017\\src\\ru\\n2\\t11\\text.txt";
        InputStream inFile = null;

        try {
            inFile = new FileInputStream(fileName);
//            readFullyByByte(inFile);
            readFullyByArray2(inFile);

        } catch (IOException e) {
            throw new IOException("An exception if opening or reading file - "+fileName,e);
        }finally {
            if(inFile!=null){
                try {
                    inFile.close();
                } catch (IOException e) {

                }
            }
        }

    }

    private static void readFullyByArray(InputStream in) throws IOException {
        byte[] buff=new byte[5];
        while (true){
            int count =in.read(buff);
            if(count!=-1){
                System.out.println(count);
                System.out.println(Arrays.toString(buff));
                System.out.println(new String(buff,0,count,"UTF-8"));
            }
            else {
                break;
            }
        }
    }

    private static void readFullyByArray2(InputStream in) throws IOException {
        byte[] buff=new byte[5];
        int count;
        while ((count =in.read(buff))!=-1){
                System.out.println(new String(buff,0,count,"UTF-8"));
        }
    }


    private static void readFullyByByte(InputStream in) throws IOException {
        int oneByte;
        while ((oneByte = in.read()) != -1) {
            System.out.print((char) oneByte);
        }
    }
}
