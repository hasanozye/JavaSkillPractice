package day16;

public class MultipleInheritance implements Interface1, Interface2 {
    @Override
    public void m1() {
        System.out.println("This is m1...");
    }

    @Override
    public void m2() {
        System.out.println("This is m1...");
    }


    public static void main(String[] args) {
        MultipleInheritance multipleInheritance = new MultipleInheritance();
        multipleInheritance.m1();
        multipleInheritance.m2();
        System.out.println(Interface1.x);
        System.out.println(Interface2.y);
    }
}
