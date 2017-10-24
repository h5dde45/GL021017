package ru.sl.p25;

import java.lang.reflect.Field;

public class Refl {
    public static void main(String[] args) {
        final Class<?> aClass=Test.class;

        Test test=new Test();
        try {
            Field field=aClass.getField("x1");
            field.setAccessible(true);
            System.out.println(field);
            System.out.println(field.getInt(test));
            field.setInt(test,5456);
            System.out.println(field);
            System.out.println(field.getInt(test));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
