package day9;

import java.util.Arrays;

public class StringReverse {
    public static void main(String[] args) {

//        Method1
        String s = "Selenium";
        String rev = "";

        for (int i = s.length() - 1; i >= 0; i-- ) {
            rev += s.charAt(i);
        }
        System.out.println("Reversed String : " + rev);

//        Method2 by converting string to char array

        String s2 = "Welcome";
        String rev2 = "";

        char[] charArray = s2.toCharArray();
        System.out.println(Arrays.toString(charArray));

        for(int i = charArray.length - 1; i >= 0 ; i--){
             rev2 += charArray[i];
        }
        System.out.println("rev = " + rev2);

//        Method 3  -  using StringBuffer Class
        StringBuffer stringBuffer = new StringBuffer("Welcome");
        System.out.println(stringBuffer.reverse());

//        Method 4  -   using StringBuilder Class
        StringBuilder stringBuilder = new StringBuilder("Welcome");
        System.out.println(stringBuilder.reverse());

    }

}
