package day3;

public class TernaryOperator {
    public static void main(String[] args) {
//         var = exp    ? result1   : result2;

//        Example1
        int a = 200, b = 100;



        /*int res = (a < b) ? a : b;
        System.out.println(res);*/

//        Example2
        int person_age = 20;
        String res = (person_age >= 18) ? "Eligible" : "Not Eligible";
        System.out.println(res);

//        Example3
        int x = (1 == 1) ? 100 : 200;
        System.out.println(x);

    }

}
