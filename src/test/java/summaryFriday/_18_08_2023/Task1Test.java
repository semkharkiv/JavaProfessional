package summaryFriday._18_08_2023;

import org.junit.jupiter.api.Test;
import summaryFriday._18_08_2023.MapAndStreamOperation.EvenOddLists;
import summaryFriday._18_08_2023.MapAndStreamOperation.Task1;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {
    @Test
    void splitEvenAndOddNumbersTest() {
        List<Integer> list = List.of(1, 2, 3, 5, 8, 9);
        EvenOddLists result = Task1.splitEvenAndOddNumbers(list);

        assertEquals(Arrays.asList(2, 8), result.getEvenList());
        assertEquals(Arrays.asList(1, 3, 5, 9), result.getOddList());
    }

    @Test
    void getEvenOddNumbersExceptionTest() {
        List<Integer> list = List.of();
        assertThrows(IllegalArgumentException.class, () -> Task1.splitEvenAndOddNumbers(list));
        assertThrows(IllegalArgumentException.class, () -> Task1.splitEvenAndOddNumbers(null));
    }
}