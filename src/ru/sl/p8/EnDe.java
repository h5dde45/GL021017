package ru.sl.p8;

enum Dog1 {
    FIRST(11),
    SECOND(22),
    THIRD(33),
    FOURTH(),
    FIFTH(55);

    private int weight;

    Dog1(int weight) {
        this.weight = weight;
    }


    Dog1() {
        weight = 99;
    }

    public int getWeight() {
        return weight;
    }
}

public class EnDe {

    public static void main(String[] args) {
        System.out.println(Dog1.SECOND.getWeight());

        for (Dog1 dog1 : Dog1.values()) {
            System.out.println(dog1 + " = "+dog1.getWeight());
            System.out.println(dog1 + " = "+dog1.ordinal());

        }
    }
}
