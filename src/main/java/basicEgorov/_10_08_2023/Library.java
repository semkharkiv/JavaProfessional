package basicEgorov._10_08_2023;

import java.util.List;
import java.util.stream.Collectors;

public class Library {
    private List<Book> books ;

    public Library(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        if (book == null) {
            throw new NullPointerException();
        }

        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> searchByAuthor(String author) {
        return books.stream()
                .filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toList());
    }

    public List<Book> searchByTitle(String title) {
        return books.stream()
                .filter(book -> book.getTittle().equals(title))
                .collect(Collectors.toList());
    }

    public List<Book> searchByYear(int year) {
        if (year<= 0){
            throw new IllegalArgumentException();
        }
        return books.stream()
                .filter(book -> book.getYear() == year)
                .collect(Collectors.toList());
    }
}