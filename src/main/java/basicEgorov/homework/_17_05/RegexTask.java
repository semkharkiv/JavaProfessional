package basicEgorov.homework._17_05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTask {
    /**
     * Задача 1 (Сложность 4/10):
     * Найти и заменить все email адреса в строке на "REDACTED".
     */

    private static void replace() {
        String input = "Contact us at info@example.com or support@example.com";
        String replacement = "REDACTED";

//        String regex="\\w\\W\\w\\.(com)";  фигня
        String regex = "\\w+\\@\\w+.\\w{2,4}"; //Соня 5

//        String regex = "\\b[\\w.%-]+@[\\w.-]+\\.[A-Za-z]{2,4}\\b"; Михаил 4

        String output = input.replaceAll(regex, replacement);
        System.out.println(output);
    }

    /**
     * Задача 2 (Сложность 6/10):
     * Проверить, является ли строка валидным номером телефона
     * в формате "+X-XXX-XXX-XXXX", где X - цифра.
     */

    private static boolean check(String phoneNumber) {
        String regex = "^\\+\\d{1}-\\d{3}-\\d{3}-\\d{4}$";
        if (phoneNumber.matches(regex)) {
            return true;
        }
        return false;
    }

    /**
     * Задача 3 (Сложность 8/10):
     * Проверить, является ли строка валидным URL-адресом,
     * начинающимся с "http://" или "https://",
     * и содержащим доменное имя и путь.
     */

    private static void checkURL(String url) {
        //String url = "https://www.example.com/path/to/page.html";
        String regex = "^(http|https)://.*$";

        boolean isValid = url.matches(regex);
        System.out.println(isValid);

    }

    /**
     * Задача с уровнем сложности 4:
     * Напишите программу на Java, которая будет проверять,
     * является ли заданная строка допустимым именем переменной.
     * Допустимые имена переменных должны начинаться с буквы или
     * знака подчеркивания, а затем могут содержать любую комбинацию
     * букв, цифр и знаков подчеркивания. Минимальная длина имени
     * переменной должна быть 2 символа.
     */

    private static boolean isValid(String myCombination) {
        if (myCombination.length() < 2) {
            return false;
        }
        String regex = "^[a-zA-Z_][a-zA-Z0-9_]*";

        return myCombination.matches(regex);

    }

    /**
     * Задача 1 (Уровень сложности: 5)
     * Проверить, является ли строка действительным IP-адресом формата IPv4.
     * String ipAddress = "192.168.0.1";
     */
    private static boolean isValidIP(String IP) {
        String regex = "^[1-9]{3}\\.[0-9]{3}\\.\\d\\.\\d";
        return IP.matches(regex);
    }

    /**
     * Задача 2 (Уровень сложности: 7)
     * Найти все даты в формате "DD-MM-YYYY" в заданной строке.
     * String text = "Some text with dates: 01-01-2022, 31-12-2023, 15-02-2024";
     */

    private static void findDate(String text) {
        String regex = "\\b\\d{2}-\\d{2}-\\d{4}\\b";

        Pattern date = Pattern.compile(regex);
        Matcher matcher1 =date.matcher(text);
        while (matcher1.find()){
            String dataText= matcher1.group();
            System.out.println(dataText);
        }
    }

    public static void main(String[] args) {
        String text = "Some text with dates: 01-01-2022, 31-12-2023, 15-02-2024";
        findDate(text);
    }

}
