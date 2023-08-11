package summaryFriday._11_08_2023;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestExampleTest {
    private String sentence = "I love my job.";

    @Test
    void countWordsTest() {
        assertEquals(1, TestExample.countWords(sentence).get("love"));
    }

    @Test
    void emptyStringTest() {
        assertNull(TestExample.countWords("").get("abc"));
    }

    @Test
    void nullStringTest() {
        assertThrows(IllegalArgumentException.class, () -> TestExample.countWords(null));
    }

    @Test
    void multipleSpacesTest() {
        assertNull(TestExample.countWords("a   b").get(""));
    }

    @Test
    void punctuationAbsenceTest() {
        assertEquals(1, TestExample.countWords(sentence).get("job"));
    }
}