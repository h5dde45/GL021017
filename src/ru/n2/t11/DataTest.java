package ru.n2.t11;

import java.io.*;
import java.util.Arrays;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class DataTest {
    public static void main(String[] args) throws IOException {
        writeToFile();
        readToFile();
    }

    private static void readToFile() throws IOException {
        GZIPInputStream inputStream=
                new GZIPInputStream(
                        new BufferedInputStream(
                                new FileInputStream(
                                        new File("C:\\java_projects\\july2017\\" +
                                                "GL021017\\src\\ru\\n2\\t11\\data.bin")
                                )
                        )
                );
        DataInput dataInput=new DataInputStream(inputStream);

        byte age=dataInput.readByte();
        String name=dataInput.readUTF();
        int[] ints=new int[dataInput.readInt()];
        for (int i = 0; i < ints.length; i++) {
            ints[i]=dataInput.readInt();
        }
        inputStream.close();

        System.out.println(age);
        System.out.println(name);
        System.out.println(Arrays.toString(ints));
    }

    private static void writeToFile() throws IOException {
        byte age=45;
        String name="New";
        int[] bytes={222,333,444,555};

        OutputStream outputStream=
                new GZIPOutputStream(
                        new BufferedOutputStream(
                                new FileOutputStream(
                                        new File("C:\\java_projects\\july2017" +
                                                "\\GL021017\\src\\ru\\n2\\t11\\data.bin"))));

        DataOutput dataOutput=new DataOutputStream(outputStream);

        dataOutput.writeByte(age);
        dataOutput.writeUTF(name);
        dataOutput.writeInt(bytes.length);
        for (int i:bytes){
            dataOutput.writeInt(i);
        }
        outputStream.flush();
        outputStream.close();

    }




}
