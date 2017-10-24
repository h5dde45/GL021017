package ru.sl.p21;

import java.util.Scanner;

public class ScanD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String name;
        double weight;
        int height;

        name=sc.nextLine();
        weight=sc.nextDouble();
        height=sc.nextInt();

        System.out.println(name);
        System.out.println(weight);
        System.out.println(height);


    }
}
