package day7;

import java.util.Arrays;

public class Assignment3FindLargestAndLowestNumber {

    public static void main(String[] args) {

        int[] garry = {100, 300, 200, 50, 20};
        int temp;
        for (int i = 0; i < garry.length - 1; i++) {
            for (int j = 0; j < garry.length - 1; j++) {
                if (garry[j] > garry[j + 1]) {
                    temp = garry[j];
                    garry[j] = garry[j + 1];
                    garry[j + 1] = temp;
                }
            }
        }
        System.out.println("garry = " + Arrays.toString(garry));
        System.out.println("Smallest number in array is: " + garry[0]);
        System.out.println("Largest number in array is: " + garry[garry.length - 1]);


    }
}
