package day9.practice;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
//        we l co m e
//output: welcome

        String str = "we l co m e";
//        str.replaceAll("");
        String last = "";
        for (int i = 0; i < str.length(); i++) {
            Character character = str.charAt(i);

            if (!Character.isSpaceChar(character)) {
                last += character;
            }
        }
        System.out.println("last = " + last);

    }
}
