package main.myLessons.allLessons;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class PolindromList {
    private static String s = "ASSDDSSA";
    private static String d = "HELLO";

    public static void main(String[] args) {
        isPalindrome(s);
        isPalindrome(d);

    }

    public static void isPalindrome(String str) {
        List<Character> chars = new ArrayList<>();
        Deque<Character> chars2 = new LinkedList<>();
        for (char ch : str.toCharArray()) {
            chars.add(ch);
        }
        System.out.println("Первый лист: " + chars);

        for (int i = 0; i < str.toCharArray().length; i++) {
            chars2.push(str.charAt(i));
        }
        System.out.println("Перевернутый лист: " + chars2);
        if (chars.equals(chars2)) {
            System.out.println("Is palindrome? - " + true);
        } else {
            System.out.println("Is palindrome? - " + false);
        }
    }
}

