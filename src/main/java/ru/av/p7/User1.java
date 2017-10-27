package ru.av.p7;

public class User1 {
    private String name;

    public User1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
