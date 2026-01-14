package day9.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OccurencesCount {
    public static void main(String[] args) {

//        4) Count Occurrences of a Character in a String
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your word: ");
        String word = scanner.next();

        Map<Character, Integer> map = new HashMap<>();

        for (char c : word.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        map.forEach((k, v) ->
                System.out.println(k + " -> " + v)
        );

        int totalCount = word.length();
        int totalCountAfterRemove = word.replace("A", "").length();// total length after removing all 'a'
        int count = totalCount - totalCountAfterRemove;
        System.out.println("Number of occurences of A is = " + count);


    }
}
