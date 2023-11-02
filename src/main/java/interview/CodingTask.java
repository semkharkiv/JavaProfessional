package interview;

import java.util.*;

public class CodingTask {
    private static String word1 = "Hello";
    private static String word2 = "Hlole";
    private static String word3 = "Java";
    private static String word4 = "Ajava";

    private static int[] arr = {1, 2, 3, 4, 5, 6};
    private static int k = 9;

    public static void main(String[] args) {
        System.out.println(isPermutation(word3, word4));
        System.out.println(isPermutation(word1, word2));
        System.out.println(getIndexes(arr, k));
    }

    public static boolean isPermutation(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        Map<Character, Integer> countMap = new HashMap<>();
        for (char c : a.toCharArray()) {
            countMap.merge(c, 1, Integer::sum);
        }

        for (char c : b.toCharArray()) {
            countMap.merge(c, -1, Integer::sum);
        }

        return countMap.values().stream().allMatch(count -> count == 0);
    }

    public static List<Integer> getIndexes(int[] arr, int k) {
        List<Integer> myList = new ArrayList<>();
        int left = 0;
        int right = arr.length - 1;
        while (left < right){
            int sum = arr[left] + arr[right];
            if (sum == k){
                myList.add(left);
                myList.add(right);
                return myList;
            }else if (sum < k){
                left++;
            }else {
                right--;
            }
        }
        return myList;
    }


}
