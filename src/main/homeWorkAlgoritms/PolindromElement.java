package main.homeWorkAlgoritms;

import java.util.Scanner;

/**
 * Palindrome Number
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 */
public class PolindromElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        isPalindrome(number);
    }

    public static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int originalNumber = number;
        while (originalNumber > 0) {
            int ostatok = originalNumber % 10;
            reversedNumber = reversedNumber * 10 + ostatok;
            originalNumber /= 10;
        }
        if (number==reversedNumber){
            System.out.println("Number is polindrom");
        }else System.out.println("Number is prime");
        return number == reversedNumber;

    }

}
