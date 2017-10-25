package ru.sl.p4;

import java.time.LocalDate;

class Gener<T> {
    T obj;

    public Gener(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    void showType() {
        System.out.println(obj.getClass().getName());
    }
}

public class SE {
    public static void main(String[] args) {
        Gener<Integer> intOb;
        Gener<String> strObj;
        Gener<LocalDate> dateObj;

        intOb=new Gener<>(45);
        strObj=new Gener<>("asd");
        dateObj=new Gener<>(LocalDate.now());

        intOb.showType();
        System.out.println(intOb.getObj());

        strObj.showType();
        System.out.println(strObj.getObj());

        dateObj.showType();
        System.out.println(dateObj.getObj());


    }
}
