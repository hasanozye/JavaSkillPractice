package day5;

import java.util.Scanner;

public class EvenOddNumberCounter {

    public static void main(String[] args) {

        /*4) count Number of Even and Odd digits in a Number
Input: 23456
Output : 3 even  2 odd*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        long inputValue = scanner.nextLong();

        int evenCounter = 0;
        int oddCounter = 0;

        while (inputValue != 0) {
            long lastDigit = inputValue % 10;
            if (lastDigit % 2 == 0) {
                evenCounter++;
            } else {
                oddCounter++;
            }


            inputValue /= 10;

        }

        System.out.println("Çift Sayılar toplam: "+ evenCounter);
        System.out.println("Tek Sayılar toplam: "+ oddCounter);

    }
}
