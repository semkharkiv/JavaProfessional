package basicEgorov.collectionAndStream;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TaskExample {
    public static void main(String[] args) {
        int[] arr = {1,2,5,4,1};
//        duplicates1((Integer)arr);
    }
//todo доделать метод 1;
    public static boolean duplicates1(Integer[] arr){
        Set<Integer> set = new HashSet<>();
        Collections.addAll(set, arr);
        return arr.length != set.size();
    }

    public static boolean duplicates2(int[] arr){
        return !(arr.length == Arrays.stream(arr)
                .distinct()
                .count());

    }
}
