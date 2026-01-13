package day9.practice;

import java.util.Scanner;

public class PalindromeStrings {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your text: ");
        String input = scanner.next();
        String rev = "";
        for (int i = input.length()-1 ; i >= 0 ; i--){
            rev += input.charAt(i);
        }

        if (rev.equals(input)){
            System.out.println("Palindrome!");;
        }else{
            System.out.println("NOT Palindrome!");
        }

    }
}
