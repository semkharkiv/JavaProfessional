package basicToday._17_03_23;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1,1,1,1,1,1,1};//{12, 15, 2, 16, 6, 7, 2, 8, 9, 3, 43};
        int minElement = Integer.MAX_VALUE;
        int secondMinEl = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minElement) {
                secondMinEl = minElement;
                minElement = numbers[i];
            } else if (numbers[i] < secondMinEl && numbers[i] != minElement) {
                secondMinEl = numbers[i];
            }if (numbers[i] == numbers[numbers.length-(i+1)]){
                System.out.println("Все числа равны");
                break;
            }
        }
        System.out.println("min element is - " + minElement);
        System.out.println("second min element is - " + secondMinEl);
    }
}
