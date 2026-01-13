package day9.practice;

public class RemoveSpecialChars {
    public static void main(String[] args) {
//        Remove special or junk chars from string

        String str = "wel&&^^%%*())3*come";

        /**
         * With StringBuilder approach
         */
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)){
                stringBuilder.append(ch);
            }
        }
        System.out.println("stringBuilder = " + stringBuilder);


        /**
         * With Regex
         */

        String cleansed = str.replaceAll("[^a-zA-Z]+", "");
        System.out.println("cleansed = " + cleansed);
    }


}
