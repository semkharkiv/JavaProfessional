package basicEgorov.homework.Hw;

import java.util.ArrayList;
import java.util.List;

/**
 * 1) В классе IntegerListDemo создайте список целых чисел.
 * Продемонстрируйте как:
 * добавить в список элемент (в начало и в конец)
 * узнать длину списка
 * удалить элемент из списка (по индексу и без)
 * узнать пустой список или нет
 * обойти список и вывести на консоль каждый элемент.
 * 2)
 * Могут ли реализации интерфейса java.util.List хранить одинаковые
 * элементы (дубликаты)? Напишите код программы, который демонстрирует ответ на этот вопрос.
 * 3)
 * создать List наполнить его 10М> элементами
 * При наполнении списка сохраняем i- тый элемент в переменную temp
 * перебрать коллекцию с помощью
 * a) for-each loop и  вызываем list.size() для каждой итерации
 * b) classic for и вызываем list.size() для каждой итерации
 * c) classic for, но list.size() определяем в переменную
 * d) classic for, list.size() определяем в переменную, перебираем с конца (i--)
 * для всех задач сделать замер времени выполнения цикла и результат вывести в консоль
 * */
public class IntegerListDemo {
    public static void main(String[] args) {
        /** 1**/
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println("Список целых чисел: " + list);

        list.add(90); //- в конец списка
        list.add(0,15); // - в начало списка
        System.out.println("Список целых чисел после добавления элемента в начало и конец: " + list);

        int sizeMyList = list.size();
        System.out.println("Длина списка: " + sizeMyList);

        list.remove(0); // - удаление по индексу
        System.out.println("Список целых чисел после удаления элемента по индексу: " + list);
        list.remove(Integer.valueOf(20)); // -удаляем первое число в листе == 20
        System.out.println("Список целых чисел после удаления элемента без указания индекса: " + list);

        System.out.println("Список целых чисел пустой? " +list.isEmpty()); // -проверка пустой лист или нет

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        /** 2**/
        List<String> list2 = new ArrayList<>();
        list2.add("apple");
        list2.add("banana");
        list2.add("orange");
        list2.add("apple");
        list2.add("banana");

        System.out.println("Список с дубликатами: " + list2);

        /** 3**/

        List<Integer> list3 = new ArrayList<>();
        // Наполнение списка
        for (int i = 0; i < 10000000; i++) {
            int temp = i;
            list3.add(temp);
        }

        // Цикл for-each loop, вызываем list.size() для каждой итерации
        long startTimeA = System.nanoTime();
        for (int element : list3) {
            int size = list3.size();
        }
        long endTimeA = System.nanoTime();
        long durationA = (endTimeA - startTimeA);

        // Classic for, вызываем list.size() для каждой итерации
        long startTimeB = System.nanoTime();
        for (int i = 0; i < list3.size(); i++) {
            int size = list3.size();
            int element = list3.get(i);
        }
        long endTimeB = System.nanoTime();
        long durationB = (endTimeB - startTimeB);

        // Classic for, list.size() определяем в переменную
        long startTimeC = System.nanoTime();
        int size = list3.size();
        for (int i = 0; i < size; i++) {
            int element = list3.get(i);
        }
        long endTimeC = System.nanoTime();
        long durationC = (endTimeC - startTimeC);

        // Classic for, list.size() определяем в переменную, перебираем с конца
        long startTimeD = System.nanoTime();
        int size2 = list3.size();
        for (int i = size2 - 1; i >= 0; i--) {
            int element = list3.get(i);
        }
        long endTimeD = System.nanoTime();
        long durationD = (endTimeD - startTimeD);

        // Вывод результатов
        System.out.println("Цикл for-each loop, вызываем list.size() для каждой итерации: " + durationA + " наносекунд");
        System.out.println("Classic for, вызываем list.size() для каждой итерации: " + durationB + " наносекунд");
        System.out.println("Classic for, list.size() определяем в переменную: " + durationC + " наносекунд");
        System.out.println("Classic for, list.size() определяем в переменную, перебираем с конца: " + durationD + " наносекунд");
    }
    }

