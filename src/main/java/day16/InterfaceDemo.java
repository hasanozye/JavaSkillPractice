package day16;

public class InterfaceDemo implements Shape {

    @Override
    public void circle() {

    }

    void triangle() {
        System.out.println("This is triangle");
    }

    public static void main(String[] args) {
        //Scenario 1
        InterfaceDemo interfaceDemo = new InterfaceDemo();
        interfaceDemo.circle(); // abstract
        interfaceDemo.square(); // default
        Shape.rectangle(); // static

        System.out.println(Shape.lenght + Shape.width);

        //Scenario 2
        Shape sh = new InterfaceDemo();
        sh.circle();
        sh.square();
        Shape.rectangle();


    }


}
