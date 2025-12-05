package day3;

public class Swapping2Numbers {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Before swapping values are.." + a + " " + b);

        //Logic1    - Third variable
        /*int t = a;
        a = b;
        b = t;*/

        System.out.println("Afre swapping values are.." + a + " " + b);

        // Logic2 - use + & - without usign third variable
        a = a+ b;
        b = a-b;




    }
}
