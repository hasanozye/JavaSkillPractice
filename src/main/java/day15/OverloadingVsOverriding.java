package day15;

class ABC {
    void m1(int a) {
        System.out.println(a);
    }

    void m2(int b) {
        System.out.println(b);
    }
}

class XYZ extends ABC {
    @Override
    void m1(int a) {
        System.out.println(a * a);
    }

    @Override
    void m2(int b) {
        System.out.println(b * b);
    }

    void m2(int a, int b) {
        System.out.println(a + b);
    }
}

public class OverloadingVsOverriding {
    public static void main(String[] args) {
        XYZ xy = new XYZ();
        xy.m1(10);
        xy.m2(20);
        xy.m2(30, 4);
    }
}
