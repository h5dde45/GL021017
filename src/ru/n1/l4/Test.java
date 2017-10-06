package ru.n1.l4;

public class Test {
    public static void main(String[] args) {
//        long[]s=new  long[Integer.MIN_VALUE];

//        Object obj;
//
//        while (true) {
//            obj = new Object();
//        }

//        List<Object> list=new ArrayList<>();
//        while (true){
//            list.add(new Object());
//        }
        Object[] ref = new Object[1];
        System.out.println(ref);
        while (true) {
            ref[0] = new Object[]{ref};
            System.out.println(ref);
            System.out.println(ref[0]);
            ref= (Object[]) ref[0];
            System.out.println(ref);
            System.out.println(ref[0]);
        }
    }
}
