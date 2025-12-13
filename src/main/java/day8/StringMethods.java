package day8;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {
//        String s = "Welcome";
//        System.out.println(s);


//        length() returns length of the string
        String s = "Welcome";
        int length = s.length();
        System.out.println(length);

        System.out.println("s.length() = " + s.length());

//        concat() - join string;
        String s1 = "welcome";
        String s2 = " to java";
        String s3 = " programming";

        System.out.println(s1 + s2);

        System.out.println(s1.concat(s2));
        System.out.println(s1.concat(s2.concat(s3)));

        System.out.println("Welcome".concat(" to java"));

//        trim() -remove spaces in right and left side
        s = "                welcome            ";
        System.out.println("s.length() = " + s.length());

        String trim = s.trim();
        System.out.println("trim.length() = " + trim.length());

//        charAt() - returns a character based on index
//        index starts from 0

        s = "welcome";
        System.out.println("s.charAt(3) = " + s.charAt(3));
        System.out.println("s.charAt(5) = " + s.charAt(5));


//        contains() - returns true/false
//        check string is part of the main string
        System.out.println("s.contains(\"wel\") = " + s.contains("wel"));   //true
        System.out.println("s.contains(\"Com\") = " + s.contains("Com")); //false

//        equals()  , equalsIgnoreCase()    - compare 2 strings
        s1 = "welcome";
        s2 = "welcome";
        System.out.println("s1.equals(s2) = " + s1.equals(s2));
        System.out.println("s1.equals(\"Welcome\") = " + s1.equals("Welcome"));
        System.out.println("s1.equalsIgnoreCase(\"Welcome\") = " + s1.equalsIgnoreCase("Welcome"));

//        replace() - replace single character/sequence of characters in a strings
        s = "welcome to selenium java python python";
        System.out.println("s.replace('e','X') = " + s.replace('e', 'X'));
        System.out.println(s.replace("python", "C#"));

//        substring() - extract substring from the main string
        s = "welcome";
        System.out.println(s.substring(2, 5));
        System.out.println(s.substring(1, 3));

//        toUpperCase() toLowerCase()   - converting case
        s = "Welcome";
        System.out.println("s.toUpperCase() = " + s.toUpperCase());
        System.out.println("s.toLowerCase() = " + s.toLowerCase());

//        split()   - split/divide the string in to multiple parts based on delimeter.
        s = "abc@xyz";
        String[] split = s.split("@");
        System.out.println("split = " + Arrays.toString(split));

//        Ex2
        s = "abc@gmail.com";
        String[] a = s.split("@");
        System.out.println(a[0]);
        System.out.println(a[1]);

//        Ex3
        String amount = "$15,20,55";    //152055
        String $ = amount.replace("$", "").replace(",", "");
        System.out.println("$ = " + $);

//        Ex4
        s = "abc,123@xyz";      //output abc , 123, xyz
        String[] a1 = s.split(",");
        System.out.println("a1 = " + Arrays.toString(a1));
        System.out.println(a1[0]);
        System.out.println(a1[1]);

        s = "abc,123@xyz";
        System.out.println("s.split(\",\")[0] = " + s.split(",")[0]);
        System.out.println("s.split(\",\")[1] = " + s.split(",")[1]);

//        Ex5
        s = "abc 123 xyz";
        String[] arr = s.split(" ");
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

//        * % ^ & (  ) - you cannot use as delimeters

//        Problem
        String name = "John Kennedy";
        System.out.println(name.contains("john"));
        System.out.println("name.toLowerCase().contains(\"john\") = " + name.toLowerCase().contains("john"));
        System.out.println("name.replace('J','j') = " + name.replace('J', 'j').contains("john"));


    }

}
