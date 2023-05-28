package summaryFriday._28_04_2023;

import java.util.Arrays;
import java.util.List;

//Task:
//1. Посчитать количество неповторяющихся слов в списке
//2. Посчитать количество людей с именем "Tom" в списке имен
//3. Из списка имен вывести первое по алфавиту
//4. Посчитать количество чисел от 1 до 1000, которые делятся на 7.
//5. Посчитать сумму квадратов чисел от 1 до 10
//6. Дан список слов "Specific" "Measurable" "Achievable" "Relevant" "Time-bound".
// С помощью стримов вывести его аббревиатуру в виде S.M.A.R.T.
public class HomeWork {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Rob", "Mark", "Aron", "Tom", "Adam", "Klara", "Maks", "Tom", "Sara", "Jack", "Klara", "Jack");

        //1-----------------------------------------

        int nonRepeatingNames = (int) names.stream()
                .distinct()
                .count();
        System.out.println("Количество не повторяющихся имен - " + nonRepeatingNames);
        //2-----------------------------------------

        long countWithTheName = names.stream()
                .filter(name -> name.equals("Tom"))
                .count();
        System.out.println("Количество людей с именем Том - " + countWithTheName);
        //3-----------------------------------------

        String firstName = names.stream()
                .sorted()
                .findFirst()
                .orElse(null);
        System.out.println("Первое имя в списке по алфавиту - " + firstName);
        //4------------------------------------------
        int[] arrayOfNumbers = new int[1000];
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = i + 1;
        }
        int[] ints = Arrays.stream(arrayOfNumbers)
                .filter(e -> e % 7 == 0)
                .toArray();
//        System.out.println(Arrays.toString(ints));


        //5-----------------------------------------

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sumOfSquared = Arrays.stream(numbers)
                .reduce(0, (result, element) -> result + element * element);
        System.out.println(sumOfSquared);


        //6-----------------------------------------
        List<String> words = Arrays.asList("Specific", "Measurable", "Achievable", "Relevant", "Time-bound");
        String abbreviation = Arrays.toString(words.stream()
                .map(word -> word.substring(0, 1))
                .toArray());

        System.out.println(abbreviation);


    }
}
