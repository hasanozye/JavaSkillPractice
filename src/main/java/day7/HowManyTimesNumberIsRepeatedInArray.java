package day7;

public class HowManyTimesNumberIsRepeatedInArray {

    public static void main(String[] args) {

        int[] a = {10, 20, 10, 30, 10, 40, 10, 50};
        int num = 30;
        int count = 0;
        for(int aValue : a){
            if (aValue == num){
                count++;
            }
        }

        System.out.println("Number of times repeated: "+ count);


    }

}
