package day15;

class Test{
    final int x = 100;
}


public class FinalKeyword {
    public static void main(String[] args) {
        Test t1 = new Test();
//        t1.x = 200;
        System.out.println("t1 = " + t1.x);
    }
}
