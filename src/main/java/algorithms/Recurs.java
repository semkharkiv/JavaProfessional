package algorithms;

import java.util.Scanner;

//Не используя управляющие конструкции: if, for и их аналоги
// получить введенное число и вывести все числа от этого до нуля на консоль
public class Recurs {

    static Scanner scanner;
        public static void main(String[] args) {
            scanner = new Scanner(System.in);
            System.out.print("Введите число: ");
            int number = scanner.nextInt();
            printNumbersToZero(number);
        }

        public static int printNumbersToZero(int n) {
            System.out.println(n);
            try {
                int check = 1 / n;
            } catch (ArithmeticException e) {
                return n;
            }
            return printNumbersToZero(n - 1);
        }
    }


