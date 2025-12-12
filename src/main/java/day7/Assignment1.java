package day7;

public class Assignment1 {

    public static void main(String[] args) {


        /*
        * 1) Sorting elements  using  for loop
a={50,20,40,10,100}
after sorting 10 20 40 50 100*/


        int[] arr = {50, 20, 40, 10, 100};

        boolean swapped = true;
        int j = 0;
        int temp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < arr.length - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
        }


    }
}
