package modul_2.array_2;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {

        int n;
        Scanner scr = new Scanner(System.in);                                           // 7.
        System.out.println("Введите переменную/размер матрицы n - ");
        n = scr.nextInt();
        double [][] matr = new double[n][n];

        System.out.println("Наша матрица - ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matr[i][j] = Math.sin((i * i - j * j) / n);
                System.out.printf("%10f",matr[i][j]);
            }
            System.out.println();
        }

        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matr[i][j] > 0) {
                    k++;
                }
            }
        }
        System.out.println("Количество положительных элементов = " +k);

    }
}
