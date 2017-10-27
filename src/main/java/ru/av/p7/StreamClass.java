package ru.av.p7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamClass {

    public static void main(String[] args) {
        List<User3> users = getAllUsers();
        users.forEach(System.out::println);
        System.out.println("============");

        users.stream()
                .filter(user3 -> user3.getAge() > 10)
                .sorted(Comparator.comparing(User3::getAge ))
                .limit(2)
                .forEach(System.out::println);

        System.out.println("============");
        users.forEach(System.out::println);


    }

    private static List<User3> getAllUsers() {
        List<User3> users = new ArrayList<>();
        users.add(new User3("gff", "jnhty", 45));
        users.add(new User3("bfbuh", "tgvd", 5));
        users.add(new User3("76yt", "yhfh665", 545));
        users.add(new User3("re", "yti8", 12));
        return users;
    }
}
