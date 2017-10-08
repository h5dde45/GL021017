package ru.n2.t2;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] data ={0,3,2,33,6,87,9,3455,67};

        System.out.println(Arrays.toString(data));
        System.out.println("==================");
        int[] merged = MergeSort.sort(data, 0, data.length);
//        System.out.println(Arrays.toString(merged));
//        System.out.println("==================");

    }

    public static int[] sort(int[] arr, int from, int len) {

        if (len == 0) {
            return new int[0];
        } else if (len == 1) {
            return new int[]{arr[from]};
        } else if (len == 2) {
            if (arr[from] < arr[from + 1]) {
                return new int[]{arr[from], arr[from + 1]};
            } else {
                return new int[]{arr[from + 1], arr[from]};
            }
        } else {
            int[] left = sort(arr, from, len / 2);
            int[] right = sort(arr, from + len / 2, len - len / 2);
            return merge(left, right);
        }
    }

    static int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int ai = 0, bi = 0;

        while (ai + bi != result.length) {
            if (ai < a.length && bi < b.length) {
                if (a[ai] < b[bi]) {
                    result[ai + bi] = a[ai++];
                } else
                    result[ai + bi] = b[bi++];
            } else if (ai < a.length) {
                while (ai < a.length)
                    result[ai + bi] = a[ai++];
            } else if (bi < b.length) {
                while (bi < b.length) {
                    result[ai + bi] = b[bi++];
                }
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(result));
        System.out.println("++++++++++++++++");
        return result;
    }
}
