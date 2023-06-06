package basicEgorov._05_06_2023;

import java.util.List;
import java.util.stream.Collectors;

public class Service {

    Author author;
    Book book;
    Gen gen;


    List<Book> m1(Author author, int year) {
        List<Book> list = gen.get();
        return list.stream().filter(e -> e.getAuthor().equals(author) && e.getYearIssue() == year).collect(Collectors.toList());
    }

    List<Book> m1(Book book) {
        List<Book> list = gen.get();
        return list.stream().filter(e -> e.equals(book)).collect(Collectors.toList());
    }
}
