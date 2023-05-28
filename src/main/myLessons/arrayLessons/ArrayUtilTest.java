package main.myLessons.arrayLessons;

import main.methods.Methods;

import java.util.Arrays;

// Напишите реализацию !!!
// Проверьте, что метод создаёт массив указанной длины
public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
    }

    public void shouldCreateArray() {
        int [] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= Methods.methodRandom();
        }
        System.out.println(Arrays.toString(arr));
    }
}
