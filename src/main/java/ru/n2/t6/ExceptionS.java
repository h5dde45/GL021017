package ru.n2.t6;

public class ExceptionS {
    public static final int SIZE=  1*1024;
    public static void main(String[] args)  {
//            if(args.length>2) {
//                try {
//                    throw new IOException();
//                } catch (IOException e) {
//                    try {
//                        throw new Throwable();
//                    } catch (Throwable throwable) {
//
//                    }
//                }
//            }

//        f();
//
//        Object[] tail=null;
//        while (true){
//           tail=new Object[]{tail,new Object[SIZE]};
//        }

          f( new Object[]{new Object[SIZE]});

    }

    private static void f(Object[] tail) {
        f(new Object[]{tail,new Object[SIZE]});
    }
}
