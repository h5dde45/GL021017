package ru.n2.t11;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class OSTest_4 {
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\java_projects\\july2017\\GL021017\\src\\ru\\n2\\t11\\text.txt";
        InputStream inFile = null;

        try {
            inFile = new FileInputStream(fileName);
//            byte[] bytes = readFullyByByte(inFile);
            byte[] bytes2 = readFullyByByte2(inFile);
            System.out.println(Arrays.toString(bytes2));

        } catch (IOException e) {
            throw new IOException("An exception if opening or reading file - "+fileName,e);
        }finally {
            closeQuietly(inFile);
        }
    }

    private static byte[] readFullyByByte2(InputStream in) throws IOException {
        ByteArrayOutputStream out=new ByteArrayOutputStream();
        byte[] buff=new byte[5];
        int count;
        while ((count=in.read(buff))!=-1){
            out.write(buff,0,count);
        }
        return out.toByteArray();
    }

    private static byte[] readFullyByByte(InputStream in) throws IOException {
        int oneByte;

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        while ((oneByte = in.read()) != -1) {
            out.write(oneByte);
        }
        return out.toByteArray();
    }
    private static void closeQuietly(InputStream inFile){
        if(inFile!=null){
            try {
                inFile.close();
            } catch (IOException e) {

            }
        }
    }

}
