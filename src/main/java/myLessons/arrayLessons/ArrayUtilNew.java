package myLessons.arrayLessons;
/*
Создайте в классе ArrayUtil метод для
заполнения массива случайными целыми числами.

class ArrayUtil {

    public void fillArrayWithRandomNumbers(int[] array) {
        // Напишите реализацию !!!
    }

}
 */
import methods.Methods;

import java.util.Arrays;

class ArrayUtilNew {
    public void fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i]=Methods.methodRandom();
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        ArrayUtilNew a =new ArrayUtilNew();
        int [] myArr = new int[5];
        a.fillArrayWithRandomNumbers(myArr);

    }
}


