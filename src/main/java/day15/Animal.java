package day15;

public class Animal {
    String color = "white";

    Animal() {
        System.out.println("This is a Animal...");
    }

    Animal(String name) {
        System.out.println(name);
    }

    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    String color = "black";

    Dog() {
        System.out.println("This is Dog...");
    }

    Dog(String name) {
        super(name);
    }

    void displayColor() {
        System.out.println("color = " + super.color);
    }

    @Override
    void eat() {
//        System.out.println("eating...");
        super.eat();
    }
}
