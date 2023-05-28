package main.algorithms.homeWorkAlgoritms;

public class _09_04_23 {
    public static void main(String[] args) {
        System.out.println(powIter(11, 2));
        System.out.println(powRecurs(11, 2));
        int[][] array = {{10,20,30},{21,30,14},{7,16,32}};
        task2(array);
    }

    private static int powIter(int x, int n) {
        int s = 1;
        for (int i = 0; i < n; i++) {
            s = s * x;
        }
        return s;
    }

    private static int powRecurs(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * powRecurs(x, n - 1);
    }

    private static void task2(int[][] array) {
        int n = array.length; //кол-во строк
        int m = array[0].length;
        int[][] table = new int[n + 2][m + 2];
        int max = array[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        max *= 10;
        for (int i = 0; i < n+2; i++) {
            table[i][0]=max; //Записали макс в 0-й столбец
            table[i][m+1]=max; //Записали макс в последний столбец
        }
        for (int j = 0; j < m+2; j++) {
            table[0][j]=max; //Записали макс в 0-й строку
            table[n+1][j]=max; //Записали макс в последний строку
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                table[i+1][j+1]=array[i][j];
                System.out.print(table[i+1][j+1]+ " ");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (table[i][j]> table[i-1][j]&&
                        table[i][j]>table[i][j-1]&&
                        table[i][j]>table[i][j+1]){
                    System.out.println(table[i][j]);
                }
            }
        }
    }

}
