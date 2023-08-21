package summaryFriday._18_08_2023.InputOutputStream;

import java.util.Map;

public class DataStorage {
    private final Map<String, Map<String, Integer>> data;

    public DataStorage(String path) {
        this.data = CSVDataReader.readCSVData(path);
    }

    public int rowIndexFind(String fieldName, String value) {
        return data.get(fieldName).get(value);
    }
}
