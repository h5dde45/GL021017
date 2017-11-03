package ru.core.g2.t3;

import java.util.Arrays;

public class Merger {
    public static void main(String[] args) {
        int[] arr = {3, 6, 9,12, 34, 67, 83,123};
        int[] arr2 = {4, 7, 9, 23, 68};

        int[] result = merge(arr, arr2);
        System.out.println(Arrays.toString(result));
    }

    private static int[] merge(int[] arr, int[] arr2) {
        int[] result = new int[arr.length + arr2.length];
        int a = 0;
        int b = 0;

        while (result.length >= (a + b + 2)) {
            if (arr[a] <= arr2[b]) {
                result[a + b] = arr[a++];
                if (a>arr.length-1){
                    break;
                }
            }else {
                result[a + b] = arr2[b++];
                if (b>arr2.length-1){
                    break;
                }
            }
        }
        if (a==arr.length){
            System.arraycopy(arr2,b,result,a+b,result.length-a-b);
        }else if(b==arr2.length){
            System.arraycopy(arr,a,result,a+b,result.length-a-b);
        }

        return result;
    }
}
