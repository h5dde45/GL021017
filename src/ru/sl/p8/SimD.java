package ru.sl.p8;

import java.util.Arrays;

public class SimD {
    public static void main(String[] args) {
        Dog dog;
        dog=Dog.FIFTH;

        System.out.println(dog);
        dog=Dog.SECOND;
        System.out.println(dog);

        switch (dog){
            case FIFTH:
                System.out.println(dog);
                break;
            case THIRD:
                System.out.println(dog);
                break;
            case SECOND:
                System.out.println(dog);
                break;
            case FOURTH:
                System.out.println(dog);
                break;
                default:
                    System.out.println("===");
        }
        Dog[]dogs=Dog.values();
        for (Dog dog1:dogs){
            System.out.print(" "+dog1);
        }
        System.out.println();
        System.out.println(Arrays.toString(dogs));
        System.out.println(Dog.class.getSuperclass());
        Dog dog1=Dog.valueOf("FOURTH");
        System.out.println(dog1);
    }
}
