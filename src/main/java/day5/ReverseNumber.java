package day5;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        /*
        * 1) Reverse a number (  %   / =   operators   )

input 1234
output 4321
        * */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Processing....");

        int reverse = 0;

        while (number != 0) {
            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }
        System.out.println("Your reverse number is: " + reverse);


    }
}
