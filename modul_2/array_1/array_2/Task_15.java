package modul_2.array_2;

import java.util.Scanner;

public class Task_15 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);                                           // 15.
        System.out.println("Число строк n - ");
        int n = scr.nextInt();
        System.out.println("Число столбцов m - ");
        int m = scr.nextInt();
        int [][] matr = new int [n][m];

        System.out.println("Наша матрица - ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matr [i][j] = (int) ( Math.random() *100);
                System.out.print(matr[i][j] + "\t");
            }
            System.out.println();
        }

        int max = matr[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (max < matr[i][j]) {
                    max = matr[i][j];
                }
            }
        }
        System.out.println("Максимальный элемент матрицы - "+max);

        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matr[i][j]%2 != 0) {
                    matr[i][j] = max;
                }
            }
        }

        System.out.println("Наша матрица - ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matr[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
