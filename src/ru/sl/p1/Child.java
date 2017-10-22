package ru.sl.p1;

public class Child  extends Parent{
    public static void main(String[] args) {
      Child child=new Child();
      child.test();
      Parent parent=new Child();
      parent.test();
      Parent parent2=new Parent();
      parent2.test();
      child.testSuper();
      parent=child;
      parent.test();
    }

    @Override
    protected void test() {
        System.out.println("child");
    }
    private void testSuper(){
        super.test();
    }
}
class Parent{
    protected void test(){
        System.out.println("parent");
    }
}
