package day6;

public class TwoDimensionalArray {
    public static void main(String[] args) {

//        decclaration
        int[][] a = new int[3][2];  // declaration
        a[0][0] = 100;
        a[0][1] = 200;

        a[1][0] = 300;
        a[1][1] = 400;

        a[2][0] = 500;
        a[2][1] = 600;

//        declaration + adding values
        int[][] arr = {
                {100, 200},
                {300, 400},
                {500, 600}
        };
        System.out.println("a.length = " + a.length);   // returns number of rows   3
        System.out.println(a[0].length);    // returns number of columns in specific row

        // read single value from an array
        System.out.println(a[1][1]);    //400

//        reading data from 2D array
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println(a[i][j]);
            }
        }

//        enhanced for loop
        for (int array[]: a ){
            for (int x: array){
                System.out.println("x = " + x);
            }
        }


    }

}
