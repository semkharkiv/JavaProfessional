package basicEgorov;

import basicEgorov.collectionAndStream.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7, 8);
 * - Фильтрация списка на нечетные числа
 * - Определение максимального значения в списке
 * - Получение среднего значения списка целых чисел
 * - Нахождение суммы чисел, кратных 3 и 5, из списка чисел
 * - Поиск наибольшей длины последовательности из уникальных чисел в списке      --------------не сделал
 * <p>
 * List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
 * - Преобразование списка строк в список чисел
 * <p>
 * List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi");
 * - Фильтрация списка строк на те, которые начинаются с 'a' и преобразование их в верхний регистр
 * - Получение списка уникальных слов из списка строк, длина которых больше 4 символов
 * <p>
 * List<Person> people = Arrays.asList(new Person("John", 25), new Person("Alice", 22), new Person("Bob", 30));
 * List<String> names = people.stream()
 * - Преобразование списка объектов класса в список их имен, отсортированных по возрасту
 * <p>
 * Написать метод (стримами и НЕ стримами), который проходится по массиву
 * и находит все пары чисел, которые в сумме дают заданное число.
 * int[] arr = {2,3,5,6,4,7,8}; K=10 - [2 8] [3 7] [6 4]
 */
public class StreamExampleHardWork {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7, 8);
        // * - Фильтрация списка на нечетные числа
        numbers.stream().filter(el -> el % 2 == 0).toList();
        // * - Определение максимального значения в списке
        numbers.stream().max(Integer::compareTo);
        //* - Получение среднего значения списка целых чисел
        numbers.stream().mapToDouble(Integer::doubleValue).average();
        //* - Нахождение суммы чисел, кратных 3 и 5, из списка чисел
        numbers.stream().filter(el -> el % 3 == 0 || el % 5 == 0).reduce((res, el) -> res + el);

        List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
        //* - Преобразование списка строк в список чисел
        strings.stream().map(String::toString).map(Integer::parseInt).toList();

        List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi");
        //* - Фильтрация списка строк на те, которые начинаются с 'a' и преобразование их в верхний регистр
        words.stream().filter(w -> w.startsWith("a")).map(String::toUpperCase).toList();
        //* - Получение списка уникальных слов из списка строк, длина которых больше 4 символов
        words.stream().filter(w -> w.length() > 4).toList();

        //* Написать метод (стримами и НЕ стримами), который проходится по массиву,
        // * и находит все пары чисел, которые в сумме дают заданное число.
        int[] arr = {2, 3, 5, 6, 4, 7, 8};    //K=10 - [2 8] [3 7] [6 4]
        int K = 10;
        List<String> collect = Arrays.stream(arr).boxed().flatMap(i -> Arrays.stream(arr).skip(arr[0])
                .filter(j -> i + j == K).mapToObj(j -> i + "+" + j + "=" + K)).collect(Collectors.toList());
        System.out.println(collect);

        List<int[]> myListArr = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i]+arr[j]==K){
                    myListArr.add(new int[]{arr[i],arr[j]});
                    System.out.println(arr[i]+" + "+arr[j]);
                }
            }
        }

        List<Person> people = Arrays.asList(new Person("John", 25), new Person("Alice", 22), new Person("Bob", 30));
        // * - Преобразование списка объектов класса в список их имен, отсортированных по возрасту
        List<String> names = people.stream().sorted(Comparator.comparingInt(Person::getAge)).map(Person::getName).collect(Collectors.toList());
        System.out.println(names);

    }
}
