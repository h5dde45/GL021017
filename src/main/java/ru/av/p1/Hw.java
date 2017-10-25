package ru.av.p1;

public class Hw {
    public static void main(String[] args) {
        System.out.println("====");
        for (int i = 0; i < args.length; i++) {
            System.out.printf("args[%d] = %s\n",i,args[i]);
        }
        HwLib.say();

        byte  b=1;
        byte c= (byte) (b+1);
    }
}
