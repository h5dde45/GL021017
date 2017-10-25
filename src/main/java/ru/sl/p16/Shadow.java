package ru.sl.p16;

public class Shadow {
    private int x=1;

    class FirstLevel{
        private int x=2;

        void f(int x){
            System.out.println(x);
            System.out.println(this.x);
            System.out.println(Shadow.this.x);
        }

        void doSmth(){
            final int x = 11;
            class MemberLocal{
                public MemberLocal() {
                    System.out.println(x);
                }
            }
        }

    }

    public static void main(String[] args) {
        Shadow shadow=new Shadow();
        Shadow.FirstLevel level=shadow.new FirstLevel();
        level.f(22);



    }

}
