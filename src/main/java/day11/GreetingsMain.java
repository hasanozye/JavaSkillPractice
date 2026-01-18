package day11;

public class GreetingsMain {
    public static void main(String[] args) {
        Greetings greetings = new Greetings();
        greetings.m1();

        String string = greetings.m2();
        System.out.println("string = " + string);
        System.out.println(greetings.m2());

        greetings.m3("John");

        String string1 = greetings.m4("David");
        System.out.println(string1);



    }
}
