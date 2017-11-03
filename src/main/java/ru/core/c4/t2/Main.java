package ru.core.c4.t2;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] data = {1, 2, 3};

        new Permutation().f(data, data.length);

    }
}

class Permutation {
    public void f(int[] data, int length) {
        if (length < 2) {
            return;
        }
        for (int i = 0; i < length; i++) {
            f2(data,i,length-1);
            f(data,length-1);
            System.out.println(Arrays.toString(data));

        }
    }

    private void f2(int[] data, int i, int length) {
        int temp=data[i];
        data[i]=data[length];
        data[length]=temp;

    }
}
