package ru.n2.t12;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

public class Charset_3 {
    public static void main(String[] args) {
        InputStream is=null;

        try {
            is=new URL("https://translate.yandex.ru/?lang=en-ru&text=available").openStream();
//            Reader reader=new InputStreamReader(is);
            Reader reader=new InputStreamReader(is,"UTF-8");

            char[] buff=new char[255];
            int count;
            while ((count=reader.read(buff))!=-1){
                System.out.println(new String(buff,0,count));
            }

        } catch (IOException e) {
        }
        finally {
            if(is!=null){
                try {
                    is.close();
                } catch (IOException e) {

                }
            }
        }
    }
}
