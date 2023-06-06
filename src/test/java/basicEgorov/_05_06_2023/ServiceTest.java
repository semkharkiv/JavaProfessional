package basicEgorov._05_06_2023;

import org.junit.jupiter.api.BeforeEach;
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
    @Mock
    Gen gen;
    @InjectMocks
    Service service;


    @Test
    void m1TestWithAuthorAndYear() {
        int year = 1985;
        List<Book> mockBooksList = new ArrayList<>();
        Mockito.when(gen.get()).thenReturn(mockBooksList);

        List<Book> result = service.m1(author,year);
        assertEquals(mockBooksList,result);
    }

    @Test
    void testM1TestWithBook() {
        List<Book> mockBooksList = new ArrayList<>();
        Mockito.when(gen.get()).thenReturn(mockBooksList);

        List<Book> result = service.m1(book);
        assertEquals(mockBooksList,result);
    }
}