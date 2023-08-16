package basicEgorov._15_08_23;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonMethodsTest {

    @Test
    void isAdult() {
        Person person1 = new Person("John",18,"address","email");
        Person person2 = new Person("Karl",15,"address 2","email 2");

        assertTrue(person1.isAdult());
        assertFalse(person2.isAdult());
    }
}