package main.exampleJavaPro._21_04_23;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {

        PriorityQueue<String> names = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int v = o1.length()-o2.length();
                if (v == 0){
                    return o1.compareTo(o2);
                }
                return v;
            }
        });

        names.add("Bob");
        names.add("Jack");
        names.add("Aron");
        names.add("Sem");
        names.add("Richard");


        names.forEach(System.out::println);  //вывод всех элементов коллекции
    }
}
