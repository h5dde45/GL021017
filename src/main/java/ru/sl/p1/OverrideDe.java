package ru.sl.p1;

import java.io.IOException;

class SuperClass {
    protected void drive() {
    }

    public void swim() throws Exception {
    }

    public void swim2() throws IOException {
    }

    public void swim3() {
    }

    String getStr() {
        return "";
    }

    Number getNum() {
        return 1;
    }

    private void go() {
    }

    static void stat() {
        System.out.println("1");
    }
}

public class OverrideDe extends SuperClass {
    @Override
    public void drive() {
    }
//     void drive() {}
//    private void drive() {}

    @Override
    public void swim() throws IOException {
    }
//    public void swim() throws Throwable {}

    @Override
    public void swim2() {
    }
//    public void swim2() throws Exception {}

//    @Override
//    public void swim3() throws Exception{}

    @Override
    String getStr() {
        return "==";
    }

//    @Override
//    Integer getStr() {return 1;}

    @Override
    Double getNum() {
        return 2.3;
    }

//    @Override
    public void go() {
    }

    static void stat() {
        System.out.println("1333333");
    }

//      void stat() {
//        System.out.println("1333333");
//    }

}
