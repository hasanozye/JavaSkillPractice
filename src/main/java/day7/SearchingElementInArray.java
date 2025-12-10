package day7;

import java.util.Scanner;

public class SearchingElementInArray {
    public static void main(String[] args) {

        int[] a = {10, 20, 30, 50, 50};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a search number: ");
        int search_num = scanner.nextInt();

        boolean status = false;

        for(int i = 0; i<5 ; i++){
            if(search_num == a[i]){
                System.out.println("Element Found!");
                status = true;
                break;
            }
        }
        if (!status){
            System.out.println("ELEMENT NOT FOUND!");
        }
    }

}
