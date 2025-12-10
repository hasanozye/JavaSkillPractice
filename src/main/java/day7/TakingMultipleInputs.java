package day7;

import java.util.Scanner;

public class TakingMultipleInputs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Sum of 2 numbers: "+ (num1 + num2));

    }


}
