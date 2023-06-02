package myLessons.arrayLessons;
/*
Разделить по классам первый метод: создать массива с рандомными числами и вывести на экран
второй класс: найти максимальный элемент массива и вывести на экран
 3-объединить оба класса в psvm
 */
import methods.Methods;

import java.util.Arrays;

public class ArrayUtilTestMax {
    public static void main(String[] args) {
        ArrayUtilTestMax test = new ArrayUtilTestMax();
        int [] ourArr=new int[6];
        test.shouldCreateArray(ourArr);
        test.shouldFindMaxNumber(ourArr);
    }

    public void shouldCreateArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Methods.methodRandom();
        }
        System.out.println("Our array is - "+Arrays.toString(arr));
    }

    public void shouldFindMaxNumber(int [] arr) {
        int maxNumb = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNumb) {
                maxNumb=arr[i];
            }
        }
        System.out.println("Max number is in our arrays is - "+maxNumb);
    }
    }

