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

class C extends B {
    void printFirstRandomString() {
        System.out.println("Java is fun");
    }

    void printSecondRandomString() {
        System.out.println("Hello from class C");
    }

    void printThirdRandomString() {
        System.out.println("Inheritance practice");
    }

}


public class InheritanceTypes {
    public static void main(String[] args) {
        B boj = new B();
        boj.a = 10;
        boj.b = 20;
        boj.display();
        boj.show();

        C coj = new C();
        coj.printFirstRandomString();
        coj.printSecondRandomString();
        coj.printThirdRandomString();
    }
}
