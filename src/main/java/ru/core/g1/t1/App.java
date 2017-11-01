package ru.core.g1.t1;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
//        int[] ints={1,2,3};
//        int[][] ints2={{1,2},{4,3}};
//
//        System.out.println(ints);
//        System.out.println(Arrays.toString(ints));
//        System.out.println(ints2);
//        System.out.println(Arrays.toString(ints2));
//        System.out.println(Arrays.deepToString(ints2));
//
//        System.out.println(3./0);
//        System.out.println(0/3.);
//        System.out.println(0/0.);

        int[] ints = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(ints));
        invert(ints);
        System.out.println(Arrays.toString(ints));
//        invertRec(ints);
//        System.out.println(Arrays.toString(ints));



    }

    public static void invert(int[] ints) {
        for (int i = 0; i < ints.length / 2; i++) {
            int temp = ints[i];
            ints[i] = ints[ints.length - i - 1];
            ints[ints.length - i - 1] = temp;
        }
    }
//    public static void invertRec(int[] ints) {
//            int temp = ints[0];
//            if(ints.length > 0){
//                int[] ints1=ints;
//                for (int i = 0; i < ints1.length-1; i++) {
//                    ints1[i]=ints[i+1];
//                }
//                invertRec(ints1);
//            }
//        ints[0]=temp;
//    }
//
//    public static void invert(int[] ints,int count) {
//        for (int i = 0; i < ints.length ; i++) {
//            int temp = ints[i];
//            ints[i] = ints[ints.length - i - 1];
//            ints[ints.length - i - 1] = temp;
//        }
//    }
}
