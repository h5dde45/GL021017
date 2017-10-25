package ru.sl.p26;

public class Outer {
    int outer_var = 100;
    static int  staticOuter_var = 1100;

    void test() {
        Inner inner = new Inner();
        inner.disptay();
    }

    class Inner { //member inner class
        int inner_var = 200;

        public void disptay() {
            System.out.println("display - "+outer_var);

        }
    }

    void test2() {
        for (int i = 0; i < 3; i++) {
            class Inner2{ //local inner class
                void display2(){
                    System.out.println("display2 - "+outer_var);
                }
            }
            Inner2 inner2=new Inner2();
            inner2.display2();
        }
    }

    static class Nested{ //nested class
        void display(){
            System.out.println(staticOuter_var);
            Outer outer=new Outer();
            System.out.println(outer.outer_var);
        }
    }

}
