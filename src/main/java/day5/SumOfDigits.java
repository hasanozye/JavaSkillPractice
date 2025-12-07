package day5;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        /*
        * 5) Find sum of digits in a number

input : 1234
sum= 10

Video Link: https://www.youtube.com/watch?v=ZLaBlxnmrxc
* */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your value: ");
        int value = scanner.nextInt();
        int sum = 0;
        while (value != 0) {

            sum += value % 10;
            value /= 10;
        }

        System.out.println(sum);

    }


}
