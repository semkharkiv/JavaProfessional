package main.myLessons.arrayLessons;

import main.methods.Methods;

import java.util.Arrays;

public class Task30 {
    public int [] ourArr(){
        int [] arr=new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= Methods.methodRandom();
        }
        System.out.println("Наш массив- "+Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] %2 !=0){
                System.out.println("Нечетный элемент массива - "+arr[i]);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Task30 t=new Task30();
        t.ourArr();
    }

}
