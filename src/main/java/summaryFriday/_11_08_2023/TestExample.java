package summaryFriday._11_08_2023;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class TestExample {
    public static void main(String[] args) {
        String sentence = "I love my job,and enjoy it";
        System.out.println(countWords(sentence));
    }

    public static Map<String, Integer> countWords(String sentence) {
        if (sentence == null){
            throw new IllegalArgumentException();
        }
        return Arrays.stream(sentence.split("[\\s\\p{Punct}]+"))
                .collect(Collectors.toMap(s -> s, s -> 1, Integer::sum));
    }
}
