package myLessons.allLessons;

import java.util.HashMap;
public class MapExample1 {
    public static void main(String[] args) {
        int[] arr = {1, 7, 4, 9, 12, 45, 3, 9, 23, 1, 7, 12};
        HashMap<Integer, Integer> ourMap = createHashMapCollection(arr);
        System.out.println(ourMap);
    }

    static HashMap<Integer, Integer> createHashMapCollection(int[] arr) {
        HashMap<Integer, Integer> ourMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            if (ourMap.get(arr[i]) != null) {
                count = ourMap.get(arr[i]);
            }
            count++;
            ourMap.put(arr[i], count);
        }


        return ourMap;
    }
}
