package basicEgorov.collectionAndStream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Task03_05 {
    public static void main(String[] args) {
        //Найти среднее арифметическое всех элементов массива.
        int[] arr = {1, 2, 3, 4, 5};
        double average = Arrays.stream(arr)
                .average()
                .orElse(Double.NaN);
        System.out.println(average);

        //Найти максимальный элемент в списке строк, длина которых больше 5 символов
        List<String> list = Arrays.asList("apple", "banana", "pear", "orange", "grapefruit");
        List<String> collect = list.stream()
                .filter(e -> e.length() > 5)
                .collect(Collectors.toList());
        System.out.println(collect);

        //Найти первый элемент списка, который начинается с буквы "A", или вернуть пустой Optional, если такого элемента нет.
        List<String> list2 = Arrays.asList("apple", "banana", "apricot", "orange", "avocado");
        Optional<String> word = list2.stream()
                .filter(s -> s.toUpperCase().startsWith("A"))
                .findFirst();
        System.out.println(word);

        //Найти сумму квадратов всех четных чисел в массиве.
        int[] arr2 = {1, 2, 3, 4, 5};
        int result = Arrays.stream(arr2)
                .filter(e-> e%2==0)
                .map(e-> e*e)
                .sum();
        System.out.println(result);

        //Получить все уникальные слова из списка строк, отсортированные в алфавитном порядке.
        List<String> list3 = Arrays.asList("apple", "banana", "orange", "pear", "orange", "apple");
        List<String> collect1 = list3.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(collect1);

        //Дан список целых чисел. Напишите программу, которая вычисляет сумму нечетных чисел в списке.
        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sum = numbers2.stream()
                .filter(e -> e % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);

        //Дан список строк. Напишите программу, которая находит самую длинную строку в списке.
        List<String> strings = Arrays.asList("Java", "Python", "C++", "Ruby", "JavaScript", "PHP");
        String s = strings.stream()
                .max(Comparator.comparingInt(String::length))
                .toString();
        System.out.println(s);

        //Дан список объектов класса Person, у которых есть поля name и age. Напишите программу, которая находит все людей старше 25 лет и сортирует их по имени в алфавитном порядке.
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 20),
                new Person("Charlie", 25),
                new Person("David", 35),
                new Person("Eve", 28));


        List<Person> sorted =  people.stream()
                .filter(person -> person.getAge() > 25)
                .sorted(Comparator.comparing(Person::getName))
                .collect(Collectors.toList());

        System.out.println(sorted);

        //Дан список целых чисел. Напишите программу, которая находит максимальный элемент в списке и умножает его на 2.
        List<Integer> numbers = Arrays.asList(1, 5, 10, 15, 20);
        int i = numbers.stream()
                .max(Comparator.comparingInt(Integer::intValue))
                .map(e->e*2)
                .get();
        System.out.println(i);

        //Дан список строк. Напишите программу, которая находит все строки, которые начинаются с буквы "J" и заканчиваются на букву "a", и выводит их в консоль.
        List<String> strings2 = Arrays.asList("Java", "JavaScript", "Python", "Ruby", "JavaFX", "Scala");
        strings2.stream()
                .filter(s1 -> s1.startsWith("J") && s1.endsWith("a"))
                .forEach(System.out::println);

        //перевести лист цифр в их char значения
        List<Integer> listA = Arrays.asList(111, 109, 103);
        String str = listA.stream()
                .map(a -> (char)a.intValue())
                .map(Object::toString)
                .collect(Collectors.joining());
        System.out.println(str);



    }
}
