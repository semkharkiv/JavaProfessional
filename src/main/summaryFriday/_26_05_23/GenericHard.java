package main.summaryFriday._26_05_23;

import java.util.Arrays;

//, ()->()), который принимает на вход массив (любого типа)
//  и реализацию интерфейса Filter c методом apply (Object o), чтобы убрать из массива лишнее.
//  Проверьте как он работает на строках или других объектах.
//  interface Filter {
//   boolean apply(o);
//  }
public class GenericHard{


    public static <T> T[] filter(T[] array,Filter<T> filter){
        int newSize=0;
        for (int i = 0; i < array.length; i++) {
            if (filter.apply(array[i])){
                array[newSize++]=array[i];
            }
        }
        return Arrays.copyOf(array,newSize);
    }

    public static void main(String[] args) {
        Integer[] integersToFilter = new Integer[]{1, 2 ,3 ,4, 5};
        String[] stringsToFilter = new String[] {"Hello", "World", "A", "B", "C"};

        Integer[] filtered1 = filter(integersToFilter,i -> i % 2 == 0);
        String [] filtered2 = filter(stringsToFilter, s -> s.length() == 5);

        System.out.println(Arrays.toString(filtered1));
        System.out.println(Arrays.toString(filtered2));
    }
}

