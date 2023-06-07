package basicEgorov._05_06_2023;

import java.util.List;
import java.util.stream.Collectors;

public class Service {
    private Author author;
    private Book book;
    private Gen gen;

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Gen getGen() {
        return gen;
    }

    public void setGen(Gen gen) {
        this.gen = gen;
    }
    public Service(Gen gen){
        this.gen = gen;
    }

    List<Book> m1(Author author, int year) {
        List<Book> list = gen.get();
        return list.stream().filter(e -> e.getAuthor().equals(author) && e.getYearIssue() == year).collect(Collectors.toList());
    }

    List<Book> m1(Book book) {
        List<Book> list = gen.get();
        return list.stream().filter(e -> e.equals(book)).collect(Collectors.toList());
    }
}
