package ru.av.p8;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class RConstr {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException,
            InvocationTargetException, InstantiationException {
        Constructor constructor=Person.class.getConstructor(String.class);
        Object o=constructor.newInstance("asd");
        System.out.println(o);
    }
}
class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
