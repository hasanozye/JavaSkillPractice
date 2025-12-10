package day7;

public class NumberOfEvenAndOddNumberInArray {
    public static void main(String[] args) {
        int[] a = {2, 5, 8, 10, 15, 20, 25};

        int even = 0;
        int odd = 0;

        for (int aValue : a) {
            if (aValue%2 == 0){
                even++;
            }else{
                odd++;
            }
        }

        System.out.println("Number of even numbers are: "+ even);
        System.out.println("Number of odd numbers are: "+odd);


    }

}
