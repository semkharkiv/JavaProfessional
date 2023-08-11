package summaryFriday._11_08_2023;

import java.util.List;
import java.util.stream.Collectors;

public class DailyTask {

    public static void main(String[] args) {
        List<Integer> numbs = List.of(1, 3, 4, 5, 6, 8, 9);
        System.out.println(findEvenNumb(numbs));
    }

    // Найти сумму четных чисел в коллекции
    public static int sumEvenNumb(List<Integer> numbs) {
        return numbs.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
    }

    // Разделить четные и нечетные числа на два списка
    public static List<Integer> findEvenNumb(List<Integer> numbs) {
        return numbs.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
    }

    public static List<Integer> findOddNumb(List<Integer> numbs) {
        return numbs.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
    }
}
