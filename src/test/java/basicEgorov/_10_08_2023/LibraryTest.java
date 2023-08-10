package basicEgorov._10_08_2023;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    private Library library;
    private List<Book> books = new ArrayList<>();

    private final Book BOOK1 = new Book("D", "B", 324);
    private final Book BOOK2 = new Book("A", "C", 123);
    private final Book BOOK3 = new Book("A", "C", 123);

    @BeforeEach
    void setUp() {
        books.clear();

        books.add(BOOK1);
        books.add(BOOK2);
        books.add(BOOK3);

        library = new Library(books);
    }

    @Test
    void addBookTest() {
        library.addBook(BOOK2);

        assertTrue(library.getBooks().contains(BOOK2));
    }

    private void execute() {
        library.addBook(null);
    }

    @Test
    void addBookExceptionTest() {
        assertThrows(NullPointerException.class, this::execute);
    }

    @Test
    void removeBookTest() {
        library.removeBook(BOOK1);

        assertFalse(library.getBooks().contains(BOOK1));
    }

    @Test
    void searchByAuthorTest() {
        assertEquals(List.of(BOOK1), library.searchByAuthor("B"));
        assertEquals(List.of(BOOK2, BOOK3), library.searchByAuthor("C"));
    }

    @Test
    void searchByTitleTest() {
        assertEquals(List.of(BOOK2, BOOK3), library.searchByTitle("A"));
        assertEquals(List.of(BOOK1), library.searchByTitle("D"));
    }

    @Test
    void searchByYearTest() {
        assertEquals(List.of(BOOK2, BOOK3), library.searchByYear(123));
        assertEquals(List.of(BOOK1), library.searchByYear(324));
    }

    @Test
    void searchByYearExceptionTest() {
        assertThrows(IllegalArgumentException.class,()-> {
            library.searchByYear(-1);
        });
    }
}