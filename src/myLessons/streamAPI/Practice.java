package myLessons.streamAPI;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

//Уровень сложности: 10
//Задача: Дан список товаров с полями "название", "цена" и "категория".
// Найти три товара с наибольшей ценой в каждой категории.
public class Practice {
    //task 1 -Найти среднее значение всех положительных чисел в списке.
    public void average(List<Integer> numb) {
        OptionalDouble average = numb.stream().filter(e -> e > 0).mapToInt(Integer::intValue).average();
    }

    //task 2 -Дан список строк. Найти все уникальные слова, начинающиеся
    // с буквы "A", и отсортировать их в алфавитном порядке.
    public void uniqueWord(List<String> word) {
        Stream<String> uniqueWords = word.stream().filter(w -> w.toUpperCase().startsWith("A")).distinct().sorted();
    }

    //task3 -Дан список пользователей с полями "имя", "возраст" и "город".
    // Найти самого молодого пользователя из города "Харьков".
    public void getYoungHuman(List<User> myList, String city) {
        User user1 = myList.stream().filter(user -> user.getCity().equals(city)).min(Comparator.comparingInt(User::getAge)).get();

    }

    //task4 -Дан список чисел. Найти два числа, сумма которых равна заданному значению.
    public static void getNumb(List<Integer> numb, int n) {
        List<String> collect = numb.stream().flatMap(i -> numb.stream().skip(numb.get(0)).filter(j -> i + j == n).map(j -> i + "+" + j + "=" + n)).toList();

    }
    //todo
    //Уровень сложности: 10
    //Задача: Дан список товаров с полями "название", "цена" и "категория".
    // Найти три товара с наибольшей ценой в каждой категории.

    public static void main(String[] args) {

    }
}
