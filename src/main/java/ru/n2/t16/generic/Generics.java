package ru.n2.t16.generic;


import java.util.Arrays;

public class Generics {
    public static void main(String[] args) {
        GenericHolder<String> strHolder=new GenericHolder<>();
        strHolder.setData("====");
        String s=strHolder.getData();
        System.out.println(s);

        GenericHolder<int[]> intArrayHolder=new GenericHolder<>();
        intArrayHolder.setData(new int[]{2,3,4,5});
        int[] data = intArrayHolder.getData();
        System.out.println(Arrays.toString(data));

    }
}
