package day16;

interface Shape {

    int lenght = 10;
    int width = 20;

    void circle();

    default void square() {
        System.out.println("this is square - default method");
    }

    static void rectangle() {
        System.out.println("this is rectangel - static method");
    }
}
