package main.basicEgorov._13_05_2023;

public class MonotonicArr {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,5,5,9,123,120,125,500};
        System.out.println(isMonotonic(array));
    }
    public static boolean isMonotonic(int[] array){
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < array.length; i++) {
            if (array[i]<array[i-1]){
                increasing=false;
            }
            if (array[i]>array[i-1]){
                decreasing=false;
            }
        }
        return increasing || decreasing;
    }
}
