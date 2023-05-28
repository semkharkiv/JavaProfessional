package algorithms;

// 1 уровень сложности: Task 1. Сумма цифр числа
//Дано натуральное число N. Вычислите сумму его цифр.
//При решении этой задачи нельзя использовать строки,
//списки, массивы (ну и циклы, разумеется).
//Task 2. Цифры числа справа налево
//Дано натуральное число N. Выведите все его цифры по одной, в обратном порядке, разделяя их
// пробелами или новыми строками.
//При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется).
// Разрешена только рекурсия и целочисленная арифметика.
public class ManipulationsWithNumbers {
    public static int sumOfDigits(int number) {
        if (number == 0) {
            return 0;
        } else {
            return (number % 10 + sumOfDigits(number / 10));
        }
    }

    public static void reversDigits(int number) {
        if (number < 10) {
            System.out.println(number);
        } else {
            int lastDigit = number % 10;
            System.out.println(lastDigit);
            reversDigits(number / 10);
        }
    }

    public static void main(String[] args) {
        int number = 435;
        System.out.println("Сумма всех цифр числа = " + sumOfDigits(number));
        reversDigits(number);
    }

}
