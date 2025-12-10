package day7;

import java.util.Scanner;

public class TakingInputFromKeyboard {
    public static void main(String[] args) {

//        int a = 200;    //hard-coded

//        Integer
        Scanner sc = new Scanner(System.in);
        /*System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Given value of a is : "+a);*/

//        Decimal
        /*System.out.print("Enter a decimal number: ");
        double v = sc.nextDouble();
        System.out.println("given decimal number is : " + v);*/

//        String
        System.out.print("Enter your name: ");
        String name  = sc.next();
        System.out.println("Your name is "+name);




    }

}
