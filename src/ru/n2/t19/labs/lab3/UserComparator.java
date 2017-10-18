package ru.n2.t19.labs.lab3;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        if (o1.getName() == null && o2.getName() != null) {
            return -1;
        }
        if (o1.getName() != null && o2.getName() == null) {
            return 1;
        }
        if (o1.getName() == null && o2.getName() == null) {
            return o1.getAge() - o2.getAge();
        }
        if (o1.getName().compareTo(o2.getName()) == 0) {
            return o1.getAge() - o2.getAge();
        }
        return o1.getName().compareTo(o2.getName());
    }
}
