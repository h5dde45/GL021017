package ru.n2.t19.labs.lab3;

public class User {
    private int age;
    private String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "\nUser{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
