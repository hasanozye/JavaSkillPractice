package day7;

public class Assignment2FindMissingNumbersInArray {

    /*
    * ) Find Missing in Number in array

a={1,4,5,3}
* numbers should be in range
* should not have duplicates
* no need of sorting order

logic:  1+2+4+5=12 (sum1)
        1+2+3+4+5=15 (sum2)
        sum2-sum1 = missing number*/

    public static void main(String[] args) {

        int[] arr = {1, 4, 3, 5, 6};
        int sum = 0;
        for (int values : arr) {
            sum += values;
        }
        System.out.println("sum = " + sum);

        int sum2 = 0;
        int i;
        for (i = arr[arr.length - 1]; i > 0; i--) {
            sum2 += i;
        }
        System.out.println("sum2 = " + sum2);

        System.out.println("(sum2 - sum) = " + (sum2 - sum));


    }
}
