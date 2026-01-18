package day11;

public class Greetings {

//    1 no params no return value

    void m1() {
        System.out.println("Hello..");
    }

    //    2 no params return value
    String m2() {
        return ("Hell ohow are you?");
    }

    //      3 takes params but no return value
    void m3(String name) {
        System.out.println("Hello" + name);
    }

    //    4 takes param also return value
    String m4(String name) {
        return "HELLO " + name;
    }


    public static void main(String[] args) {

    }
}
