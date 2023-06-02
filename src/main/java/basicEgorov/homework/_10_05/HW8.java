package basicEgorov.homework._10_05;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class HW8 {
    /**
     * Дан двумерный массив строк, необходимо выбрать
     * все уникальные слова из массива и вернуть отсортированный
     * список слов в порядке убывания частоты их появления в массиве.
     */
    private static void m8() {
        String[][] words = {{"apple", "orange", "pear", "orange"},
                             {"orange", "pear", "pear", "apple"},
                             {"apple", "orange", "orange", "pear"},
                             {"orange", "pear", "apple", "pear"}};


        List<String> uniqueWords = Arrays.stream(words).flatMap(Arrays::stream).distinct()
                .sorted(Comparator.comparingInt(w -> -Math.toIntExact((countOfRepeatedWords(words, w)))))
                .collect(Collectors.toList());

       uniqueWords.forEach(System.out::println);
    }

    public static long countOfRepeatedWords(String[][] words, String word) {
        long count = Arrays.stream(words).flatMap(Arrays::stream).filter(w -> w.equals(word)).count();
        return count;
    }

    /**
     * Есть двумерный массив строк, представляющий таблицу данных,
     * где первый столбец - это имена, а остальные столбцы -
     * это числовые значения. Вам нужно написать программу,
     * которая найдет среднее значение для каждого числового
     * столбца, игнорируя строки, которые не могут быть преобразованы в числа.
     */

    private static void m9() {
        String[][] data = {
                {"name1", "10", "20", "30"},
                {"name2", "40", "50", "not a number"},
                {"name3", "60", "70", "80"}
        };
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");

        List<Double> collect = Arrays.stream(data)
                .map(p -> Arrays.stream(p).skip(1))
                .map(p->p.filter(pattern.asPredicate()))
                .map(p -> p.mapToDouble(Double::parseDouble).average().orElse(0))
                .toList();
        for (int i = 0; i < collect.size(); i++) {
            System.out.println(i + 1 + ": " + collect.get(i));
        }


    }

    public static void main(String[] args) {
        m8();
        m9();
    }
}
