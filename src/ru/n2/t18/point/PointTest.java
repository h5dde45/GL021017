package ru.n2.t18.point;

import java.util.HashMap;

public class PointTest {
    public static void main(String[] args) {
        HashMap<Point,String> map=new HashMap<>();

        map.put(new Point(1,2),"a");
        System.out.println(map);

        map.put(new Point(2,1),"b");
        System.out.println(map);

        map.put(new Point(1,2),"c");

        System.out.println(map);
    }
}
