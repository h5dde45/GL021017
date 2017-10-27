package ru.av.p7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Constructor {
    public static void main(String[] args) {

        List<String> names= Arrays.asList("qwe","asd","zxc");
        System.out.println(names);
        List<User1> users=map(names, User1::new );
        System.out.println(users);

    }

    private static <S,T> List<T> map(List<S> list, Function<S,T> function) {
        List<T> result=new ArrayList<>();
        list.forEach(s -> result.add(function.apply(s)));
        return result;
    }


}
