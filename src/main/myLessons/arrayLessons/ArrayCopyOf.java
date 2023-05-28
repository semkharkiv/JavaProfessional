package main.myLessons.arrayLessons;

import java.util.Arrays;

public class ArrayCopyOf {
    public static void main(String[] args) {


        String[] copyArr = new String[5];

        copyArr[0] = "1";      //первые два
        copyArr[1] = "2";      //числа = copyArr1
        copyArr[2] = "3";
        copyArr[3] = "4";      //последние
        copyArr[4] = "5";      //два числа = copyArr

        String [] newCopyArr1;
        newCopyArr1 =Arrays.copyOfRange(copyArr,0,2);     //копируем первые два числа
        System.out.print("["+Arrays.toString(newCopyArr1));

        String[] newCopyArr;
        newCopyArr = Arrays.copyOfRange(copyArr, 3, 5);       //копируем последние два числа
        System.out.println(Arrays.toString(newCopyArr)+"]");
        
    }
}
