package modul_2.array_2;

import java.util.Arrays;
import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);                                           // 10.
        System.out.println("Введите переменную/размер матрицы n - ");
        int n = scr.nextInt();
        int [][] matr = new int [n][n];

        System.out.println("Наша матрица - ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matr[i][j] = (int) (Math.random()*200 - 100);
                System.out.printf("%4d",matr[i][j]);
            }
            System.out.println();
        }

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    array[i] = matr[i][j];
                }
            }
        }

        System.out.println(" Положительные элементы в главной диагонали - ");
        for (int i = 0; i < n; i++) {
            if (array[i] > 0) {
                System.out.printf("%3d",array[i]);
            }
        }

    }
}
