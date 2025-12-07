package day5;

import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {

        /*3) Count Number of Digits in a Number (looping)

Input : 423424
output : 6*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Pls enter your number.. ");
        long value = scanner.nextLong();

        int counter = 0;
        while (value != 0){
            value /= 10;
            counter++;
        }

        System.out.println("Your number digits are: "+counter);



    }
}
