package ru.n2.t4;

public class Heap {
    public static void main(String[] args) {
//        byte[] arr= new byte[Integer.MAX_VALUE / 2];
//        long[] arr= new long[Integer.MIN_VALUE];
//        System.out.println(Integer.MIN_VALUE-1);
//        Object ref;
//        while (true){
//            ref=new Object();
//        }
//
//        Object[] ref = new Object[1];
////        while (true)
//        {
//            Object[] a = new Object[1];
//            Object[] b = new Object[1];
//            a[0] = b;
//            b[0] = a;
//            ref[0] = a;
//        }
//
//        System.out.println(ref);
//        System.out.println(ref[0]);
//        System.out.println(((Object[]) ref[0])[0]);
//        System.out.println(((Object[]) ((Object[]) ref[0])[0])[0]);

        Object[] ref = new Object[1];
        while (true){
            ref=new Object[]{ref};
        }
    }
}
