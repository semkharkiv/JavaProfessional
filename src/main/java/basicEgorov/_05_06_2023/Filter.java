package basicEgorov._05_06_2023;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    private List<Book> books;

    public Filter(List<Book> books) {
        this.books = books;
    }
    public List<Book> filterBooks(int year,Author author){
        List<Book> filteredBooks = new ArrayList<>();
        for (Book book : books){
            if (book.getYearIssue() == year && book.getAuthor() == author){
                filteredBooks.add(book);
            }
        }
        return filteredBooks;
    }
}
