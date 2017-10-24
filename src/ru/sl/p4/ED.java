package ru.sl.p4;

public class ED {
    public static void main(String[] args) {
        Ex<Double> d1=new Ex<>(75.95,"Math");
        Ex<Double> d2=new Ex<>(75.75,"Math");

        System.out.println(d1.equalsMark(d2));

        Ex<Integer> d3=new Ex<>(76,"Math");
        System.out.println(d3.equalsMark(d2));


    }
}

class Ex<T extends Number> {
    private String name;
    private T mark;

    public Ex(T mark, String name) {
        this.name = name;
        this.mark = mark;
//        mark=new T();
    }

    public T getMark() {
        return mark;
    }

    private int roundMark() {
        System.out.println(/*Math.round*/(mark.floatValue()));
        return Math.round(mark.floatValue());
    }

//    public boolean equalsMark(Ex<T> obj) {
//        return roundMark() == obj.roundMark();
//    }

    public boolean equalsMark(Ex<?> obj) {
        return roundMark() == obj.roundMark();
    }


}
