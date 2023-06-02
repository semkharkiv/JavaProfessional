package algorithms.homeWorkAlgoritms;

public class _26_03_23 {
    public static void main(String[] args) {
       hanoi(5,1,3,2);
    }

    public static void hanoi(int n, int from, int to, int aux) {
        if (n == 1) {
            System.out.println("/Переместить диск  1 из стержня " + from + " на стержень " + to);
            return;
        }
        hanoi(n-1, from, aux, to);
        System.out.println("Переместить диск " + n + " из стержня " + from + " на стержень " + to);
        hanoi(n-1, aux, to, from);
    }
}
