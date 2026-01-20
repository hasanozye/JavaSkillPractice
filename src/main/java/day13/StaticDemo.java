package day13;

public class StaticDemo {
    static int a = 10;
    int b = 20;

    static void m1(){
        System.out.println("this is m1 static method...");
    }

    void m2(){
        System.out.println("this is m2 non-static method");
    }

    void m(){
        System.out.println(a);
        System.out.println(b);
        m1();
        m2();
    }


    public static void main(String[] args){
        System.out.println("a = " + a);
        m1();

        StaticDemo staticDemo = new StaticDemo();
        System.out.println("staticDemo.b = " + staticDemo.b);
        staticDemo.m2();

        staticDemo.m();
    }

}
