package basicEgorov.collectionAndStream;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HwTasks {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] strings = {"rock", "123", "ball", "java", "456"};
        arrayCheck(strings);
        String str = "Я в ахуе от новых тем и в ахуе от темы Спринг!";
        nonCensuredWord(str);

        uniqueWordsInText();
        average();

    }

    // Написать программу на Java, которая на вход получает массив
    // строк и проверяет, есть ли среди них хотя бы одна строка,
    // содержащая только цифры.
    // Если есть, то программа должна вернуть эту строку,
    // иначе - вернуть null.
    public static void arrayCheck(String[] str) {
        Optional<String> result = Arrays.stream(str)
                .filter(s -> s.matches("\\d+"))
                .findFirst();
        if (result.isPresent()) {
            System.out.println(result.get());
        } else System.out.println("is empty");
    }

    //написать программу на Java, которая считывает текстовый файл,
    // заменяет в нем все вхождения слова "???"
    // на слово "вырезано цензурой" и сохраняет изменения в тот же файл

    public static void nonCensuredWord(String str) {
        String result = Arrays.stream(str.split(" "))
                .map(w -> w.replaceAll(
                        "ахуе", " *вырезано цензурой* "))
                .collect(Collectors.joining(" "));
        System.out.println(result);
    }

    //Напишите программу на Java, которая
    // запрашивает у пользователя строку и выводит
    // на экран все уникальные слова в этой строке, отсортированные в алфавитном порядке.
    public static void uniqueWordsInText() {
        String text;
        System.out.println("Введите текст :");
        text = scanner.nextLine();
        String[] words = text.split(" ");
        String distinct = Arrays.stream(words)
                .distinct()
                .sorted()
                .collect(Collectors.joining(", "));
        System.out.println("Уникальные слова в нашем тексте - " + distinct);
    }

    //Напишите программу на Java, которая запрашивает
    // у пользователя текст, содержащий числа в формате
    // "число.число", и выводит на экран среднее арифметическое всех чисел в тексте.
    public static void average() {
        String numbers;
        System.out.println("Введите текст, содержащий числа в формате 'число.число':");
        numbers = scanner.nextLine();
        double average = Arrays.stream(numbers.split(" "))
                .filter(s -> s.matches("\\d+\\.\\d+"))
                .mapToDouble(Double::parseDouble)
                .average()
                .getAsDouble();
        System.out.println(average);
    }
}
