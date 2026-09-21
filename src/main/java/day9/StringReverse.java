package day9;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {

//        Method 1
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your str: ");
        String str = scanner.next();


        /*String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        System.out.println("Your reversed string is " + result);*/

//        Method 2 by converting string to array
        char[] charArr = str.toCharArray();


    }

}
