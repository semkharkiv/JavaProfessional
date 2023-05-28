package summaryFriday._28_04_2023;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

//1. Отсортировать с помощью стримов список из строк
//- по алфавиту
//- в обратном порядке
//2. Из списка чисел типа Integer с помощью стримов создать список их строковых представлений


public class StreamExample {
    public static void main(String[] args) {
        List<String> group1 = Arrays.asList("Tom","Mark","Dany","Tim");
        List<String> group2 = Arrays.asList("John","Santos","Rob","Clark");
        List<String> group3 = Arrays.asList("Jane","Mary","Erik","Sem");

        List<List<String>> university = Arrays.asList(group1, group2, group3);



        //1
        List<String> listSorted = group1.stream()
                .sorted()
                .collect(Collectors.toList());
        List<String> listSortedRevers = group1.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());


        //2
        List<Integer> intList = Arrays.asList(1,21,4,63,7,9,12);

        intList.stream()
                .map(Objects::toString)
                .collect(Collectors.toList());
    }
}
