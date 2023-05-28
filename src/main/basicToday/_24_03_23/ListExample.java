package main.basicToday._24_03_23;
/**
 * // 1 - Вывести список со словом student в начале
 * // 2 - написать метод, который возвращал список имен, начинающихся на определенную букву s
 * // 3 - написать метод, который выводил бы имена, в которых количетсво букв больше n, и печатал их в CAPSLOCK
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Mary", "Jane", "Tom", "Mark", "Ann", "Tim");
        //1 задача ============
//        List<String> modifiedNames = new ArrayList<>();
//        for (int i = 0; i < names.size(); i++) {
//            modifiedNames.add("Student " + names.get(i));
//        }
//        System.out.println(modifiedNames);
        //===================
//        printNamesInCaps(names, 3);
        //===================
        List<String> namesLetter = getNamesByLetter(names, "M");
        System.out.println(namesLetter);
    }

    //3 задача =================
    public static void printNamesInCaps(List<String> names, int n) {
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            if (name.length() > n) {
                System.out.println(name.toUpperCase());
            }
        }
    }
    //=================

    //2 задача =============
    public static List<String> getNamesByLetter(List<String> names, String letter) {
        List<String> newNames = new ArrayList<>();
        for (String name : names)
            if (name != null && name.toLowerCase().startsWith(letter.toLowerCase())) {
                newNames.add(name);
            }
        return names;
    }
}

