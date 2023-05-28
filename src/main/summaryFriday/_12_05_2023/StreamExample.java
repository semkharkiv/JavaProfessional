package main.summaryFriday._12_05_2023;

import main.summaryFriday._28_04_2023.Cat;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamExample {
    public static void main(String[] args) {

        // task 1
        Cat cat1 = new Cat("Tom", 2, "black", true);
        Cat cat2 = new Cat("Mikky", 1, "white", false);
        Cat cat3 = new Cat("Vasya", 3, "white", true);
        Cat cat4 = new Cat("Steve", 1, "grey", false);
        Cat cat5 = new Cat("Bob", 2, "black", true);
        List<Cat> catList = Arrays.asList(cat1, cat2, cat3, cat4, cat5);
        feed(catList);

        // task 2
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = getSum(integers);

        // task 3
        Map<Boolean, List<Integer>> map = getMap();
    }

    private static void feed(List<Cat> catList) {
        for (int i = 0; i < catList.size(); i++) {
            if (catList.get(i).isHungry()) {
                catList.get(i).setHungry(false);
            }
            catList.stream().filter(Cat::isHungry).forEach(c -> c.setHungry(false));
        }
    }

    private static int getSum(List<Integer> integers) {
        int oddSum = 0;
        for (Integer i : integers) {
            if (i % 2 != 0) {
                oddSum += i;
            }
        }
        //через стрим
        int sum = integers.stream().filter(i -> i % 2 != 0).mapToInt(Integer::intValue).sum();
        //
        return oddSum;
    }

    private static Map<Boolean, List<Integer>> getMap() {
        Map<Boolean, List<Integer>> map = new TreeMap<>();
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                if (map.containsKey(true)) {
                    map.get(true).add(i);
                } else {
                    map.put(true, new ArrayList<>());
                }
            } else {
                if (map.containsKey(false)) {
                    map.get(false).add(i);
                } else {
                    map.put(false, new ArrayList<>());
                }
            }
        }
        //через стрим
        Map<Boolean, List<Integer>> map2 = IntStream.range(0,100).boxed().collect(Collectors.partitioningBy(i-> i%3 ==0));
        //return map2;
        return map;
    }
}
