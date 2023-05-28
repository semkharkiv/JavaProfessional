package summaryFriday._26_05_23;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GenericExam {
    //преобразовать массив в список
    public <T> List<T> makeList(T[] t){
        List<T> list = Arrays.stream(t).collect(Collectors.toList());
        return list;
    }
    //преобразовать список в массив
    public static  <T> T[] makeArray(List<T> list){
        return (T[]) list.toArray();
    }

    public static void main(String[] args) {
        List<Integer> numb = Arrays.asList(1,2,3,4,5);

        Object[] myArr = makeArray(numb);
        System.out.println(Arrays.toString(myArr));
    }
}
