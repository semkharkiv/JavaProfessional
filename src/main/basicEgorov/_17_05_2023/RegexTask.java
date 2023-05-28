package main.basicEgorov._17_05_2023;

public class RegexTask {
    /**
     *Задача 1 (Сложность 4/10):
     *Найти и заменить все email адреса в строке на "REDACTED".
     */

    private static void replace() {
        String input = "Contact us at info@example.com or support@example.com";
        String replacement = "REDACTED";

//        String regex="\\w\\W\\w\\.(com)";  фигня
        String regex= "\\w+\\@\\w+.\\w{2,4}"; //Соня 5

//        String regex = "\\b[\\w.%-]+@[\\w.-]+\\.[A-Za-z]{2,4}\\b"; Михаил 4

        String output = input.replaceAll(regex,replacement);
        System.out.println(output);
    }

    /**
     *Задача 2 (Сложность 6/10):
     *Проверить, является ли строка валидным номером телефона
     *в формате "+X-XXX-XXX-XXXX", где X - цифра.
     */

    private static boolean check(String phoneNumber) {
        String regex = "^\\+\\d{1}-\\d{3}-\\d{3}-\\d{4}$";
        if (phoneNumber.matches(regex)){
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

    private static void checkURL() {
        String url = "https://www.example.com/path/to/page.html";

               String regex = "^(http|https)://.*$";


                boolean isValid = url.matches(regex);
        System.out.println(isValid);

    }

    public static void main(String[] args) {
        replace();
        String phoneNumber = "+1-555-123-4567";
        System.out.println(check(phoneNumber));
        checkURL();
    }
}
