package day3;

public class OperatorsDemo {

    public static void main(String[] args) {
        //1) Arithmetic operators + - * / %
        int a = 20, b = 10;
        System.out.println("Sum of a and b is: " +( a + b));
        System.out.println("Diff of a and b is: " +( a - b));
        System.out.println("Mul of a and b is: " +( a * b));
        System.out.println("Div of a and b is: " +( a / b));
        System.out.println("Modulo Div of a and b is: " +(a % b));

//        Relational/comparison operators > >=  <   <= !=   ==
//        Returns boolean value - true or false

        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a==b);
        System.out.println(a!=b);

//        Logical opeartos  &&  ||  !
//        returns boolean value - true/false
//        works between 2 boolean values

        boolean x = true;
        boolean y = false;

        System.out.println(x&&y);   //false;
        System.out.println(x || y);
        System.out.println(!x);
        System.out.println(!y);

        boolean b1 = 10 > 20;
        System.out.println(b1); // false

        boolean b2 = 20>10;
        System.out.println(b2); // true

        System.out.println(b1 && b2);   // false
        System.out.println(b1 || b2);   // true

        System.out.println((10< 20) && (20 > 10));  //true
        System.out.println((10< 20) || (20 > 10));  //true

        System.out.println(!(10<20));


    }


}
