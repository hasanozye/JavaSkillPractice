package day7;

import java.util.Arrays;

public class Assignment1 {

    public static void main(String[] args) {


        /*
        * 1) Sorting elements  using  for loop
a={50,20,40,10,100}
after sorting 10 20 40 50 100*/


        int[] arr = {50, 20, 40, 10, 100};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));


    }
}
