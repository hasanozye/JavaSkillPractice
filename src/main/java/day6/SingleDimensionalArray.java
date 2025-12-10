package day6;

import java.util.Arrays;

public class SingleDimensionalArray {

    public static void main(String[] args) {

//        Declaration
        /*int[] arr = new int[5];

//adding values into array
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        */

//        declaration + adding values into array
        int[] a = {10, 20, 30, 40, 50};

//        find size of an array
        System.out.println(a.length);   //

//        read single value from an array
        System.out.println(a[2]);   //30
        System.out.println(a[0]);   //10

//        read multiple values from an array
//        System.out.println(Arrays.toString(a));

//        normal for loop
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }

//        enhanced for loop / for-each loop ıs desıgned for specifically Arrays collections etc.

        for (int x : a) {
            System.out.println(x);
        }

    }
}
