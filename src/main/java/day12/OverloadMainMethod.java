package day12;

public class OverloadMainMethod {
    void main(int a) {
        System.out.println(a);
    }

    void main(int a, int b) {
        System.out.println("sum: " + (a + b));
    }

    public static void main(String[] args) {
        OverloadMainMethod overloadMainMethod = new OverloadMainMethod();
        overloadMainMethod.main(100);
        overloadMainMethod.main(100,200);

    }
}
