package main.basicEgorov._22_05_2023;

import java.util.ArrayList;
import java.util.List;

public class ExceptionTasks {
    //Задача 1: Уровень сложности 6/10
    //Создайте пользовательское исключение InvalidDataException,
    //которое наследуется от RuntimeException. Напишите метод, который принимает строку и выбрасывает InvalidDataException,
    //если длина строки превышает 10 символов. Поместите вызов этого метода в блок try-catch и обработайте исключение,
    //выводя сообщение об ошибке.

    public static void exceptionInvalidData(String s){
        try{
            if (s.length()<=10){
                System.out.println(s);
            }
        }catch (MyException e){
            System.out.println("The string exceeds the maximum character limit.");
        }
    }

    //Задача 2: Уровень сложности 5/10
    //
    //Имеется список объектов. Каждый объект имеет метод process(),
    //который может выбросить исключение ProcessFailedException. Вам нужно написать код,
    //который обрабатывает каждый объект в списке. Если при обработке какого-либо объекта возникает ProcessFailedException,
    //ваш код должен продолжить обработку остальных объектов и после обработки всех объектов выбросить исключение,
    //сообщающее, какие объекты не удалось обработать.

    class ProcessFailedException extends Exception{
        public ProcessFailedException(String message) {
            super(message);
        }
    }
    class Object {
        public void process() throws ProcessFailedException {

        }
    }
    public static void main(String[] args) {
        List<Object> objects = new ArrayList<>();
        List<Object> failed = new ArrayList<>();

        for (Object obj : objects){
            try {
                obj.process();
            }catch (ProcessFailedException e){
                failed.add(obj);
            }
        }
    }

    //Задача 3: Уровень сложности 7/10
    //
    //Напишите код для чтения данных из файла и записи в другой файл.
    //Ваш код должен корректно обрабатывать следующие ситуации:
    //
    //Исходный файл не существует.
    //Невозможно открыть файл для чтения (например, из-за отсутствия прав доступа).
    //Невозможно открыть файл для записи.
    //Происходит ошибка во время чтения или записи.
    //В каждом из этих случаев ваш код должен выбрасывать пользовательское исключение,
    //которое содержит информацию о том, что пошло не так, а также подробную информацию
    //о первоначальном исключении (если оно есть).
}
