package day5;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {

        /*2) Palindrome number ( conditional statements + looping)
input 121
after reversing 121
Video link: https://youtu.be/kNE3vq1g2e8?si=NWbZyCI-uoisVWQu*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int number = scanner.nextInt();
        int firstNumber = number;

        int random = 0;

        while (number != 0) {

            random = random * 10 + number % 10;
            number = number / 10;
        }
        if (firstNumber == random){
            System.out.println("Your number is Palindrome!");
        }else{
            System.out.println("Your number is NOT a Palindrome");
        }


    }

}
