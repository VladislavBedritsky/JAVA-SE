package modul_2.array_2;

import java.util.Scanner;

public class Task_16 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);                                           // 16.
        System.out.println("Число строк/столбцов n - ");
        int n = scr.nextInt();
        int [][] matr = new int [n][n];

        int num = 1;
        int k = n * n / 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matr[(j - i + k) % n][(i * 2 - j + n) % n] = num++;
            }
        }

        System.out.println("Наша матрица - ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matr[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
