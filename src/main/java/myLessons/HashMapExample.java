package myLessons;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, Integer> hashMap = new HashMap<>();

        int[] numbs = new int[]{2, 3, 2, 5, 6, 5, 7, 7, 9};

        for (int num : numbs) {
            Integer count = hashMap.get(num);
            hashMap.put(num, (count == null ? 1 : count + 1));
        }
        System.out.println(hashMap);
    }
}
