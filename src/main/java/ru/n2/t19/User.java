package ru.n2.t19;

public class User implements Comparable<User>{
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
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(User that) {
//        return this.name.compareTo(that.name);
        return new Integer(this.age).compareTo(new Integer(that.age));
//        return this.age-that.age;
    }
}
