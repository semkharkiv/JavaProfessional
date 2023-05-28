package main.basicEgorov.homework.Hw;
//todo осталось решить два пункта отмеченных ниже

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 10);
 * - Фильтрация списка на нечетные числа
 * - Определение максимального значения в списке
 * - Получение среднего значения списка целых чисел
 * - Нахождение суммы чисел, кратных 3 и 5, из списка чисел
 * todo
 * - Поиск наибольшей длины последовательности из уникальных чисел в списке
 * -----------------------------
 * <p>
 * List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
 * - Преобразование списка строк в список чисел
 * <p>
 * List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi");
 * - Фильтрация списка строк на те, которые начинаются с 'a' и преобразование их в верхний регистр
 * - Получение списка уникальных слов из списка строк, длина которых больше 4 символов
 * <p>
 *     todo то что внизу ...
 * List<Person> people = Arrays.asList(new Person("John", 25), new Person("Alice", 22), new Person("Bob", 30));
 * List<String> names = people.stream()
 * - Преобразование списка объектов класса в список их имен, отсортированных по возрасту
 */
public class StreamAndCollectionsOperation {
    private List<Integer> numbers;

    public StreamAndCollectionsOperation(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    /**
     * * - Фильтрация списка на нечетные числа
     *
     * @return список с четными числами
     */
    public List<Integer> filerOddNumbers() {
        return numbers.stream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toList());
    }

    /**
     * * - Определение максимального значения в списке
     *
     * @return - максимальное число в списке
     */
    public int findMaxEl() {
        int max = numbers.stream()
                .max(Integer::compare).get();
        System.out.println(max);
        return max;
    }

    /**
     * * - Получение среднего значения списка целых чисел
     *
     * @return int average
     */
    public int average() {
        int average = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum() / numbers.size();
        System.out.println(average);
        return average;
    }

    /**
     * * - Нахождение суммы чисел, кратных 3 и 5, из списка чисел
     *
     * @return int value
     */
    public int findSumOfMultiples() {
        int valueSum = numbers.stream()
                .filter(e -> e % 3 == 0 || e % 5 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(valueSum);
        return valueSum;
    }
    //todo- доделать
//    public int maxNotUniqueNumbersSize(){
//        int maxLength = 0;
//        return maxLength;
//    }

    /**
     * * - Преобразование списка строк в список чисел
     * return - Список преобразованный из стрингов в интеджер
     */
    public List<Integer> getStringToInteger(List<String> myList) {
        List<Integer> intList = new ArrayList<>();
        for (String str : myList) {
            int num = Integer.parseInt(str);
            intList.add(num);
        }
        System.out.println(intList);
        return intList;
    }


    public List<Integer> getStringToIntegerWithStream(List<String> myList) {
        List<Integer> intList = myList.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(intList);
        return intList;
    }

    /**
     * * - Фильтрация списка строк на те, которые начинаются с 'a' и преобразование их в верхний регистр
     *
     * @return отфильтрованный список
     */
    public List<String> filterList(List<String> myList) {
        List<String> newList = myList.stream()
                .filter(s -> s.startsWith("a"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(newList);
        return newList;
    }

    /**
     * * - Получение списка уникальных слов из списка строк, длина которых больше 4 символов
     *
     * @return преобразованный список
     */
    public List<String> getUniqueList(List<String> myList) {
        List<String> uniqueWordsList = myList.stream()
                .flatMap(s -> Arrays.stream(s.split("\\s+"))) //применяем метод flatMap() для разделения каждой строки на отдельные слова и преобразования каждого слова в отдельный элемент
                .filter(s -> s.length() > 4)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueWordsList);
        return uniqueWordsList;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 10, 11, 15);
        List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
        List<String> words = Arrays.asList("apple", "banana", "apricot", "kiwi", "apple", "banana", "cherry", "kiwi");


        StreamAndCollectionsOperation sAc = new StreamAndCollectionsOperation(numbers);

        List<Integer> newList = sAc.filerOddNumbers();
        System.out.println("Обновленный список с четными числами");
        System.out.println(newList);
        System.out.println("Максимальное число из списка");
        sAc.findMaxEl();
        System.out.println("Сред.арифм. листа");
        sAc.average();
        System.out.println("Сумма чисел кратных 3м и 5ти");
        sAc.findSumOfMultiples();
//        sAc.maxNotUniqueNumbersSize();
        System.out.println("Преобразованный лист стрингов в лист интеджеров ");
        sAc.getStringToInteger(strings);
        sAc.getStringToIntegerWithStream(strings);
        System.out.println("Преобразованный лист со стрингами на букву а записанные с заглавным регистром");
        sAc.filterList(words);
        System.out.println("Преобразованный список с уникальными стрингами,длинна который больше 4х ");
        sAc.getUniqueList(words);
    }


}
