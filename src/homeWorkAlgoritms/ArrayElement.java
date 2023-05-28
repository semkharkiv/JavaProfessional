package homeWorkAlgoritms;

/**
 * Find the element that appears once in a sorted array
 * Given a sorted array in which all elements occur twice
 * (one after the other) and one element appears only once.
 */
public class ArrayElement {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4, 4, 12, 12, 16, 16, 24, 24};
        int onceElem = 0;
        char a = 9999;
        for (int i = 0; i < arr.length - 1; i += 2) {
            if (arr[i] != arr[i + 1]) {
                onceElem = arr[i];
                break;
            } else onceElem = arr[arr.length - 1];
        }
        System.out.println("In this array non-repeating element is - " + onceElem);
        System.out.println(a);
    }
}
