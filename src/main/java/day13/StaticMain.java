package day13;

import static day13.StaticDemo.a;
import static day13.StaticDemo.m1;

public class StaticMain {
    public static void main(String[] args) {
        System.out.println(a);
        m1();

        StaticDemo staticDemo = new StaticDemo();
        System.out.println(staticDemo.b);
        staticDemo.m2();
        staticDemo.m();
    }
}
