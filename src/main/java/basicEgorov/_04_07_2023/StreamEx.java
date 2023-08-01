package basicEgorov._04_07_2023;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx {
    public static void main(String[] args) {
        // Задача 1: Фильтрация чисел больше 5 и вывод в порядке убывания
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> collect = numbers.stream().filter(e -> e > 5).sorted(Comparator.reverseOrder()).toList();

        // Задача 2: Преобразование строк в верхний регистр и удаление дубликатов
        List<String> words = Arrays.asList("apple", "banana", "cherry", "Apple", "Banana", "Cherry");
        List<String> strings = words.stream().map(String::toUpperCase).distinct().toList();

        // Задача 3: Вывод квадратов чисел, удовлетворяющих условию
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> integers = nums.stream().map(e -> e * e).filter(e -> e % 2 != 0).toList();

        // Задача 4: Подсчет суммы четных чисел
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer integer = values.stream().filter(e -> e % 2 == 0).reduce(Integer::sum).get();

        // Задача 5: Преобразование чисел в строки и объединение их с разделителем
        List<Integer> integer1 = Arrays.asList(1, 2, 3, 4, 5);
        String collect1 = integer1.stream().map(Object::toString).collect(Collectors.joining(","));

        // Задача 6: Поиск первого четного числа
        Integer integer2 = integer1.stream().filter(e -> e % 2 == 0).findFirst().orElse(-1);

        // Задача 7: Проверка, все ли строки начинаются с буквы "A"
        boolean a = words.stream().allMatch(w -> w.startsWith("A"));

        // Задача 8: Пропуск первых 3 чисел и сумма оставшихся
        Optional<Integer> reduce = nums.stream().skip(3).reduce(Integer::sum);

        // Задача 9: Выбор минимального и максимального числа из листа
        Integer integer3 = nums.stream().min(Integer::compareTo).orElseThrow();
        Integer integer4 = nums.stream().max(Integer::compareTo).orElseThrow();

        // Задача 10: Группировка слов по длине
        Map<Integer, List<String>> collect2 = words.stream().collect(Collectors.groupingBy(String::length));

        // Задача 11: Подсчет среднего значения чисел
        double v = integer1.stream().mapToInt(Integer::intValue).average().orElse(0);

        // Задача 12: Поиск всех слов, содержащих букву "a"
        List<String> a1 = words.stream().filter(w -> w.contains("a")).toList();

        // Задача 13: Преобразование чисел в квадрат и сортировка в обратном порядке
        Stream<Integer> sorted = integer1.stream().map(e -> e * e).sorted(Comparator.reverseOrder());

        // Задача 14: Преобразование чисел в двоичный формат и объединение в строку
        String collect3 = integer1.stream().map(Integer::toBinaryString).collect(Collectors.joining(", "));

        // Задача 15: Фильтрация чисел, кратных 3, и преобразование их в строки
        List<String> strings1 = numbers.stream().filter(e -> e % 3 == 0).map(Object::toString).toList();

        //Задание 16: Преобразование списка строк в список чисел
        List<String> object = Arrays.asList("1","bread","2","apple");
        List<Integer> integers1 = object.stream().filter(e -> e.matches("\\d+")).map(Integer::valueOf).toList();
    }

}
