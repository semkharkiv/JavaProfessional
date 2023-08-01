package basicToday._09_07_23;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Anagram {
    //Дан список слов, необходимо проверить содержат ли они одинаковые символы(являются ли анаграммами)
    public static void main(String[] args) {
        List<String> listStr = List.of("Java", "Rama", "Basic", "Logo", "Mara");
        List<String> listStr2 = List.of("Rama", "Mara","Aram","RMAA","MRAA");
        List<String> listStr3 = List.of("Rama");


        System.out.println(isAnagram(listStr));
        System.out.println(isAnagram(listStr2));
        System.out.println(isAnagram(listStr3));
    }

    public static boolean isAnagram(List<String> stringList) {
        if (stringList.isEmpty()) {
            return false;
        }
        Map<Character, Integer> firstMap = stringToMap(stringList.get(0));
        return stringList.stream()
                .map(el -> stringToMap(el))
                .allMatch(el -> el.equals(firstMap));
    }

    public static Map<Character, Integer> stringToMap(String str) {
        return str.chars().mapToObj(e-> (char)e).map(Character::toLowerCase)
                .collect(Collectors.toMap(el -> el, el -> 1,Integer::sum));
    }

}
