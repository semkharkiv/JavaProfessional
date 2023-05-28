package basicEgorov._05_08_23;

import main.basicEgorov.collectionAndStream.Person;
import main.myProject.bookLibrary.Book;
import main.myProject.bookLibrary.BookDatabaseImpl;

import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.OptionalLong;
import java.util.stream.Collectors;


public class StreamExample {
    public static void main(String[] args) {
        BookDatabaseImpl bookDatabase = new BookDatabaseImpl();
        Book book1 = new Book("Лев Толстой", "Детство", 1852);
        bookDatabase.save(book1);

        Book book2 = new Book("Федор Достоевский", "Бесы", 1871);
        bookDatabase.save(book2);

        Book book3 = new Book("Антон Чехов", "Дуэль", 1891);
        bookDatabase.save(book3);

        Book book4 = new Book("Николай Гоголь", "Шинель", 1843);
        bookDatabase.save(book4);

        Book book5 = new Book("Джейн Остин", "Гордость и предубеждение", 1813);
        bookDatabase.save(book5);

        Book book6 = new Book("Патрик Зюскинд", "Парфюмер", 1985);
        bookDatabase.save(book6);

        Book book7 = new Book("Марио Пьюзо", "Крестный Отец", 1969);
        bookDatabase.save(book7);

        Book book8 = new Book("Джейн Остин", "Эмма", 1815);
        bookDatabase.save(book8);

        Book book9 = new Book("Федор Достоевский", "Игрок", 1866);
        bookDatabase.save(book9);

        Book book10 = new Book("Федор Достоевский", "Двойник", 1845);
        bookDatabase.save(book10);

        Book book11 = new Book("Антон Чехов", "Тоска", 1886);
        bookDatabase.save(book11);

        Book book12 = new Book("Антон Чехов", "Хамелеон", 1884);
        bookDatabase.save(book12);

        Book book13 = new Book("Николай Гоголь", "Тарас Бульба", 1835);
        bookDatabase.save(book13);



        getMostProAuthors(bookDatabase.getBooks());
    }

        /**
         * Дан список целых чисел.
         * Найдите минимальное и максимальное значения в списке и выведите их на консоль.
         * 5-10
         */
        public static void getNums(List<Integer> integers) {
            Integer intMax = integers.stream().max(Integer::compareTo).get();
            Integer intMin = integers.stream().min(Integer::compareTo).get();

            System.out.println("Min element is - "+ intMin +" and Max element is - "+intMax);
        }

    /**
     * Дан список строк. Найдите все строки, которые начинаются с буквы "A",
     * отсортируйте их по алфавиту и выведите на консоль.
     * 6-10
     */

    public static void getA(List<String> strings) {
        List<String> wordsWithFirstLetterIsA = strings.stream().filter(s -> s.startsWith("A"))
                .toList();
    }

    /**
     * Дан список объектов класса Person,
     * содержащих поля name и age.
     * Найдите средний возраст всех людей в списке и выведите его на консоль.
     * 7-10
     */

    public static void getAvgAge(List<Person> people) {
        OptionalDouble average = people.stream().mapToInt(Person::getAge).average();
    }
    /**
     * Дан список строк, каждая строка
     * содержит название города и его население в тысячах человек,
     * разделенных запятой. Необходимо найти топ N городов с
     * наибольшим населением. Напишите метод, который принимает
     * список строк и число N и возвращает список топ N городов.
     * String str = "New-York,10000"
     *
     * 8-10
     */

    public static List<String> getTOPNCities(List<String> cities, int n) {
        List<String> collect = cities.stream().map(city -> city.split(","))
                .sorted((city1, city2) ->
                        Integer.compare(Integer.parseInt(city2[1].trim()),
                                Integer.parseInt(city1[1].trim())))
                .limit(n)
                .map(city -> city[0])
                .toList();
        return collect;
    }

    /**
     * Дана коллекция объектов класса Book, содержащая поля title,
     * author и year. Напишите метод, который находит автора,
     * написавшего наибольшее количество книг. Если таких авторов несколько,
     * то вернуть список их имен.
     *
     * 9-10
     */

    public static List<String> getMostProAuthors(List<Book> books) {
        Map<String, Long> collectAuthor = books.stream().collect(Collectors.groupingBy(Book::getAuthor, Collectors.counting()));
        OptionalLong max = collectAuthor.values().stream().mapToLong(Long::longValue).max();
        List<String> authorWithMostBookCollections = collectAuthor.entrySet().stream().filter(entry -> entry.getValue() == max.getAsLong()).map(Map.Entry::getKey).toList();
        System.out.println(authorWithMostBookCollections);

        return authorWithMostBookCollections;
    }


}
