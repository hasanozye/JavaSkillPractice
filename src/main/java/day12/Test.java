package day12;

public class Test {

    int number;

    void m1(int number) {
        number += 10;
        System.out.println("Value in the method: " + number);
    }

    void m2(Test test) {
        test.number = test.number + 10;
        System.out.println("Value in the method; " + test.number);
    }
}
