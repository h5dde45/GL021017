package ru.av.p7;

import java.util.*;

public class Start {
    public static void main(String[] args) {
        List<User> users = getAllUsers();
        System.out.println(users);

//        Collections.sort(users, new Comparator<User>() {
//            @Override
//            public int compare(User user1, User user2) {
//                return user1.getFirstName().compareTo(user2.getFirstName());
//            }
//        });
//        Collections.sort(users, (user1, user2) ->
//                user1.getFirstName().compareTo(user2.getFirstName()));

//        Collections.sort(users, Comparator.comparing((u)->u.getFirstName()));

        Collections.sort(users, Comparator.comparing(User::getFirstName));
        users.forEach(user -> System.out.print(user.getFirstName() + ", "));
        System.out.println();
        users.forEach(System.out::println);

        System.out.println();
        System.out.println(users);

        Collection<User> usersCol = users;
        removeUser(usersCol, "gff");
        System.out.println(users);

        List<String> list = new ArrayList<>();
        users.forEach(user -> list.add(user.getFirstName()));

        System.out.println("List = " + list);
        list.replaceAll(s -> {
            StringBuilder builder=new StringBuilder(s);
            return builder.reverse().toString();
        });
        System.out.println("List = " + list);
    }


    private static void removeUser(Collection<User> usersCol, String str) {
        usersCol.removeIf(user -> user.getFirstName().equals(str));
    }

    private static List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("gff", "jnhty"));
        users.add(new User("bfbuh", "tgvd"));
        users.add(new User("76yt", "yhfh665"));
        users.add(new User("re", "yti8"));
        return users;
    }
}
