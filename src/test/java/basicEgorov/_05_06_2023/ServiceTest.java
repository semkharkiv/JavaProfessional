package basicEgorov._05_06_2023;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTest {
    @Mock
    Book book;
    @Mock
    Author author;
//    @Mock
//    Gen gen;
    @InjectMocks
    Service service;


    @Test
    void m1TestWithAuthorAndYear() {
        Author testAuthor = new Author("t", true, 1);
        int year = 2000;

        Gen gen = Mockito.mock(Gen.class);
        List<Book> testList = new ArrayList<>();

        Book book1 = new Book(testAuthor, "test1", 1999);
        Book book2 = new Book(testAuthor, "test2", 2000);
        Book book3 = new Book(testAuthor, "test3", 2001);

        testList.add(book1);
        testList.add(book2);
        testList.add(book3);

        Service service1 = new Service(gen);
        Mockito.when(gen.get()).thenReturn(testList);

        List<Book> res = service1.m1(testAuthor, 2000);
        List<Book> expected = testList.stream()
                .filter(e -> e.getAuthor().equals(testAuthor) && e.getYearIssue() == year)
                .toList();

        assertEquals(expected, res);
    }

    @Test
    void testM1TestWithBook() {
        List<Book> mockBooksList = new ArrayList<>();

    }
}