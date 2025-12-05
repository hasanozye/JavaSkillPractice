package day2;

public class DataTypesDemo {

    public static void main(String[] args) {

        // Numeric data types

        int a = 10, b = 200;

        System.out.println(a);
        System.out.println(b);
        System.out.println(a+b);

        byte by = 120;
        System.out.println(by);

        short sh = 250;
        System.out.println(sh);

        long l = 1234567890124115331L; /*Literal is needed after 10 digits*/
        System.out.println(l);

//        Decimal number - float double

        float price = 150.5F; // Literal is need at the end of the value
        System.out.println(price);

        double item_price = 145.23423423;
        System.out.println(item_price);

//        Character
        char grad = 'B';
        System.out.println("The grad of the student is: " + grad);

        // boolean - allowed only tur /  false
        boolean bool = true;
        System.out.println(bool);

        //STring
        String name = "John";
        System.out.println(name );


    }
}
