package day5;

public class WhileLoopDemo {

    public static void main(String[] args) {

//        Example1 1.....10
        int i = 1;  // initialization


        while (i <= 10) {     // condition
            System.out.println(i);  // 1 2 3  4 5 67 8  9 10
            i++;        // incrementation
        }

//        Example2: print "hello" 10 times

        int j = 1;
        while (j <= 10) {
            System.out.println("Hello");
            j++;
        }

//        Example3: print even numbers 1.....10
        int z = 2;
        while (z <= 10) {
            System.out.println(z);
            z += 2;
        }

//        method2
        int x = 1;
        while (x <= 10) {
            if (x % 2 == 0) {
                System.out.println(i);
            }
            x++;
        }

//        odd numbers
        int a = 1;
        while (a <= 10) {
            if (a % 2 != 0) {
                System.out.println(a);
            }
            a++;
        }

        //    Example 4

//    print 10 9 8 7 6 5 ....... 1

        int b = 10;
        while( b>0){
            System.out.println(b);
            b--;
        }



    }







}
