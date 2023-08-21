package summaryFriday._18_08_2023.InputOutputStream;

public class Task2 {
    // На вход дан CSV файл. Требуется написать модуль, который индексирует этот файл и предоставляет метод для поиска
// индекса по значению
// RowIndex find(fieldName: String, value: String)
// , где RowIndex = Integer
    public static void main(String[] args) {
        System.out.println(CSVDataReader.readCSVData("src/main/Task2.csv"));
    }
}
