package ru.n2.t1;

import java.util.Arrays;

public class L3 {
    public static void main(String[] args) {
//        int[] arr = {40, 1, 52, 3, 64, 5, 6, 87, 8, 29};
//        System.out.println(Arrays.toString(arr));
//        _Sort.sort(arr);
//        System.out.println(Arrays.toString(arr));

        int[] arr1={1,2,3,4,5,6};
        int[] arr2={0,0,0,0,0,0};

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        System.arraycopy(arr1,0,arr2,2,2);
        System.arraycopy(arr1,1,arr1,3,2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

//        for (int i = 0; i < arr.length - 1; i++) {
//            if(arr[i]>arr[i+1]) {
//                int tmp = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = tmp;
//            }
//        }
//        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < arr.length - 1; i++) {
//            int tmp=arr[i];
//            arr[i]=arr[i+1];
//            arr[i+1]=tmp;
//        }
//        System.out.println(Arrays.toString(arr));
//
//        for (int i = arr.length-1; i > 0; i--) {
//            int tmp=arr[i];
//            arr[i]=arr[i-1];
//            arr[i-1]=tmp;
//        }
//        System.out.println(Arrays.toString(arr));

    }
}

class _Sort {
    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int index = i;
            int tmp = arr[index];
            while (index > 0 && tmp < arr[index - 1]) {
                arr[index] = arr[index - 1];
                index--;
            }
            arr[index] = tmp;
        }
    }
}

class BubbleSort { //пузырек n*(n/2)=(n^2)/2
    public static void sort(int[] arr) {
        for (int i = arr.length - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}
