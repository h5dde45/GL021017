package ru.core.g1.t1;

import java.util.Arrays;

public class BubbleSorted {
    public static void main(String[] args) {
        int[][] data = {
                {},
                {3},
                {66, 3},
                {6, 33, 5},
                {45, 89, 43, 27, 445, 7, 3}
        };

        for (int[] ints : data) {
            System.out.print(Arrays.toString(ints) + " -> ");
            SelectSort.sort(ints);
            System.out.println(Arrays.toString(ints));
        }
    }
}

class BubbleSortLeft {
    public static void sort(int[] ints) {
        for (int i = 0; i < ints.length - 1; i++) {
            for (int j = ints.length - 2; j >= i; j--) {
                if (ints[j] > ints[j + 1]) {
                    int tmp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = tmp;
                }
            }
        }
    }
}

class BubbleSortRight {
    public static void sort(int[] ints) {
        for (int i = ints.length - 1; i >=0; i--) {
            for (int j = 0; j < i; j++) {
                if (ints[j] > ints[j + 1]) {
                    int tmp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = tmp;
                }
            }
        }
    }
}

class SelectSort {
    public static void sort(int[] ints) {
        for (int i = 0; i < ints.length - 1; i++) {
            for (int j = i; j < ints.length - 1; j++) {
                if (ints[i] > ints[j + 1]) {
                    int tmp = ints[i];
                    ints[i] = ints[j + 1];
                    ints[j + 1] = tmp;
                }
            }
        }
    }
}
//class SelectIndexSort {
//    public static void sort(int[] ints) {
//
//        for (int i = 0; i < ints.length - 1; i++) {
//            int index = i;
//            for (int j = i; j < ints.length - 1; j++) {
//                if (ints[i] > ints[j + 1]) {
//                    index = j+1;
//                }
//
//            }
//            int tmp = ints[i];
//            ints[i] = ints[index];
//            ints[index] = tmp;
//        }
//    }
//}
