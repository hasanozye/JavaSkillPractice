package day14;

class A {
    int a;

    void display() {
        System.out.println(a);
    }
}

class B extends A {
    int b;

    void show() {
        System.out.println(b);
    }
}

class C extends B{

}


public class InheritanceTypes {
    public static void main(String[] args) {
        B boj = new B();
        boj.a = 10;
        boj.b = 20;
        boj.display();
        boj.show();
    }
}
