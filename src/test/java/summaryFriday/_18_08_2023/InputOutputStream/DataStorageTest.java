package summaryFriday._18_08_2023.InputOutputStream;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class DataStorageTest {
    private DataStorage dataStorage;

    @Test
    void rowIndexFindTest() {
        Map<String, Map<String, Integer>> data = new HashMap<>();

        data.put("employee", Map.of("Petrov", 2, "Ivanov", 0, "Sidorov", 1));
        data.put("department", Map.of("Security", 2, "IT", 0, "Administration", 1));
        data.put("salary", Map.of("1000", 2, "2500", 0, "4000", 1));

        dataStorage = new DataStorage("src/main/Task2.csv");


        //todo доделать
    }
}