package exampleJavaPro._17_08_2023;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class ClientTest {
    Client clientTest;

    @BeforeEach
    void setUp() {
        clientTest = new Client();
    }

    @Test
    void idNotEmptyTest() {

        assertNotNull(clientTest.getId());
        assertFalse(clientTest.getId().isEmpty());

//        assertTrue(clientTest.getId() != null && !clientTest.getId().isEmpty());
    }

    @Test
    void isAdultTrueTest() {
        LocalDate dateBirthTest = LocalDate.of(1990, 01, 01);
        clientTest.setDateBirth(dateBirthTest);
        LocalDate dateCurrentTest = LocalDate.of(20223, 01, 01);
        assertTrue(clientTest.isAdult(dateCurrentTest));
    }

    @Test
    void isAdultFalseTest() {
        LocalDate dateBirthTest = LocalDate.of(2010, 01, 01);
        clientTest.setDateBirth(dateBirthTest);
        LocalDate dateCurrentTest = LocalDate.of(20223, 01, 01);
        assertFalse(clientTest.isAdult(dateCurrentTest));
    }
    //todo решить проблему с эксепшном
    @Test
    void isAdultArgumentIsNullTest() {
        LocalDate dateCurrentNull = null;
        assertThrows(IllegalArgumentException.class, () -> clientTest.isAdult(dateCurrentNull));
    }

    @Test
    void isNameNullTest() {
        String stringNull = null;
        assertThrows(IllegalArgumentException.class, () -> clientTest.setName(stringNull));
    }

    @Test
    void isSurnameNullTest() {
        String stringNull = null;
        assertThrows(IllegalArgumentException.class, () -> clientTest.setSurname(stringNull));
    }

    @Test
    void notCreateAccount100Test() {
        List<Account> accountsTest = mock(ArrayList.class);
    }
}
