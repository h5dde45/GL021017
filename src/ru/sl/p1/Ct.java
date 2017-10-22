package ru.sl.p1;

class Anim {
    void doAnim() {
    }
}

public class Ct extends Anim {
    void doCat1() {
    }

    public static void main(String[] args) {
        Ct ct = new Ct();
        ct.doCat1();
        ct.doAnim();

        Anim anim = new Ct(); //upcast
        ct.doCat1();

        int i = 127;
        byte b = (byte) i;//downcast
    }
}
