package summaryFriday._18_08_2023.MapAndStreamOperation;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task1 {
    // Разделить четные и нечетные числа на два списка
    public static EvenOddLists splitEvenAndOddNumbers(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException();
        }
        Map<Boolean, List<Integer>> map = list.stream()
                .collect(Collectors.groupingBy(num -> num % 2 == 0));
        return new EvenOddLists(map.get(false), map.get(true));
    }
}
