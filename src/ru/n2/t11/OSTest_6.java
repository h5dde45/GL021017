package ru.n2.t11;

import java.io.*;

public class OSTest_6 {
    public static void main(String[] args) throws IOException {
        String fileFromName = "C:\\java_projects\\july2017\\GL021017\\src\\ru\\n2\\t11\\lib.png";
        String fileToName = "C:\\java_projects\\july2017\\GL021017\\src\\ru\\n2\\t11\\lib2.png";

//        for (int i = 1; i < 64 * 1024; i*=2) {
//            InputStream in = null;
//            OutputStream out = null;
//
//            try {
//                in = new FileInputStream(fileFromName);
//                out = new FileOutputStream(fileToName);
//                long startTime = System.currentTimeMillis();
//                copy(in, out,i);
//                long endTime = System.currentTimeMillis();
//                System.out.println("time - " + (endTime - startTime) + " msc");
//            } catch (FileNotFoundException e) {
//                throw new IOException("Exception then copy from - '" + fileFromName + "' to '" +
//                        fileToName + "'", e);
//            } finally {
//                closeQuietly(in);
//                closeAndFlushQuietly(out);
//            }
//        }
        for (int i = 1; i < 64 * 1024; i*=2) {
            InputStream in = null;
            OutputStream out = null;

            try {
                in = new BufferedInputStream(new FileInputStream(fileFromName),i);
                out =new BufferedOutputStream(new FileOutputStream(fileToName),i);
                long startTime = System.currentTimeMillis();
//                copy(in, out,i);
                copy(in, out);
                long endTime = System.currentTimeMillis();
                System.out.println("time - " + (endTime - startTime) + " msc");
            } catch (FileNotFoundException e) {
                throw new IOException("Exception then copy from - '" + fileFromName + "' to '" +
                        fileToName + "'", e);
            } finally {
                closeQuietly(in);
                closeAndFlushQuietly(out);
            }
        }
    }

    private static void closeAndFlushQuietly(OutputStream out) {
        if (out != null) {
            try {
                out.flush();
            } catch (IOException e) {
                try {
                    out.close();
                } catch (IOException e1) {

                }
            }
        }
    }

    private static void closeQuietly(InputStream in) {
        if (in != null) {
            try {
                in.close();
            } catch (IOException e) {

            }
        }
    }

    private static void copy(InputStream in, OutputStream out,int i) throws IOException {
        byte[] buff = new byte[i];
        int count;
        while ((count = in.read(buff)) != -1) {
            out.write(buff, 0, count);
        }
    }

    private static void copy(InputStream in, OutputStream out) throws IOException {
        int oneByte;
        while ((oneByte = in.read()) != -1) {
            out.write(oneByte);
        }
    }
}
