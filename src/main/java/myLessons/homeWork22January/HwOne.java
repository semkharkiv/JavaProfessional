package myLessons.homeWork22January;
/*
1. Дан массив размера N-1 , который должен содержать только целые числа
в диапазоне от 1 до N.
Каждое число представлено в одном экземпляре, кроме одного числа.
Найдите недостающий элемент.
*/


public class HwOne {
    public static void main(String[] args) {
        HwOne h = new HwOne();
        int[] array=new int[]{9,3,10,5,1,8,2,4,7};

        System.out.println("This number is not in the array: " + h.searchNumber(array) );
}

    public int searchNumber(int[] array){

        int needElement = array.length+1;
        int allSum = needElement * (needElement + 1) / 2;
        int sum = 0;
        for (int tempVariable : array) {
            sum += tempVariable;
        }

        return (allSum - sum);
    }


}

