package main.myLessons;

import java.util.Scanner;

public class CalculatorGpt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        char operator;

        System.out.print("Введите первое число: ");
        num1 = scanner.nextDouble();

        System.out.print("Введите оператор (+, -, *, /, %): ");
        operator = scanner.next().charAt(0);

        System.out.print("Введите второе число: ");
        num2 = scanner.nextDouble();

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            default:
                System.out.println("Ошибка! Неправильный оператор.");
                return;
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}

