package summaryFriday._28_04_2023;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

//1. Создать Supplier, который генерирует случайные значения типа Integer
//2. Создать BiFunction, которая возводит первый аргумент типа int в степень второго аргумента типа int
//3. Создать функцию, которая обрезает входную строку до 5 символов, делает их upper case
//и добавляет ____ в конец.
public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> (int) (Math.random() * 100);
        System.out.println(supplier.get());
        System.out.println("------------------------");
        BiFunction<Integer, Integer, Integer> function = (o1, o2) -> (int) Math.pow(o1, o2);
        System.out.println(function.apply(2, 3));
        System.out.println("------------------------");
        Function<String, String> myString = s -> s.substring(0, 5);
        Function<String, String> beforeFunction = String::toUpperCase;
        Function<String, String> afterFunction = s -> s + "___";
        Function<String, String> finalFunction = myString.compose(beforeFunction).andThen(afterFunction);
        //-----тоже самое строка 19-22
        Function<String,String> myStringNew = s1 -> s1.substring(0,5).toUpperCase() + "___";
        //----------------------------
        String s = finalFunction.apply("Orange");
        String s1 =myStringNew.apply("Orange");
        System.out.println(s1);
    }

}
