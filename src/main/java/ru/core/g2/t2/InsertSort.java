package ru.core.g2.t2;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] ints = {3, 8, 22, 98, 6, 14, 9, 4};
        System.out.println(Arrays.toString(ints));
//        sortInsert(ints);
        sortBinary(ints);
        System.out.println(Arrays.toString(ints));
    }

    private static void sortInsert(int[] data) {
        for (int i = 1; i < data.length; i++) {
            int newValue = data[i];
            int location = i - 1;

            while (location >= 0 && data[location] > newValue) {
                data[location + 1] = data[location];
                location--;
            }
            data[location + 1] = newValue;
        }
    }

    private static void sortBinary(int[] data) {
        for (int i = 1; i < data.length; i++) {

            int pos = Arrays.binarySearch(data, 0, i, data[i]);
            if (pos < 0) {
                pos = Math.abs(pos);
                pos--;
            }
//            int[] temp = new int[i - pos];
//            System.arraycopy(data, pos, temp, 0, i - pos);
//            data[pos] = data[i];
            int temp=data[i];
            System.arraycopy(data, pos, data, pos + 1, i - pos);
            data[pos] = temp;

        }
    }
}
