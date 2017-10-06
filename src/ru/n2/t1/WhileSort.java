package ru.n2.t1;

import java.util.Arrays;

public class WhileSort {
    public static void main(String[] args) {
//        int[] a = {0, 2, 4, 7, 9};
//        int[] b = {0, 0, 3, 8};

//        System.out.println(Arrays.toString(Mergel.mergel(a, b)));

        int[][][] data={
                {{},{}},
                {{0},{}},
                {{},{0}},
                {{0},{0}},
                {{0,2},{1,3}},
                {{0,2,7,9,123},{1,3,4,5,6}}
        };

        for (int[][] ints:data){
            int[] merged=Mergel.mergel(ints[0],ints[1]);
            System.out.println(Arrays.toString(ints[0]));
            System.out.println(Arrays.toString(ints[1]));
            System.out.println(Arrays.toString(merged));
            System.out.println("==================");
        }

    }
}

class Mergel {
    static int[] mergel(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int ai = 0;
        int bi = 0;

        while (ai + bi != result.length) {
            if (ai < a.length  && bi < b.length ) {
                if (a[ai] < b[bi]) {
                    result[ai + bi] = a[ai++];
                } else {
                    result[ai + bi] = b[bi++];
                }
            } else if (ai < a.length) {
                while (ai < a.length) {
                    result[ai + bi] = a[ai++];
                }
            } else if (bi < b.length) {
                while (bi < b.length) {
                    result[ai + bi] = b[bi++];
                }
            }
        }
        return result;
    }
}
