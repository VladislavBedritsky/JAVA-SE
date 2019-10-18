package modul_2.array_2;

import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {

        Scanner scrN = new Scanner(System.in);                                           // 13
        System.out.println("Введите переменную/размер матрицы n - ");
        int n = scrN.nextInt();
        int [][] matr = new int [n][n];

        System.out.println("Наша матрица - ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matr [i][j] = (int) ( Math.random() *100 );
                System.out.print(matr[i][j] + "\t");
            }
            System.out.println();
        }
        int k;
        do {
            k = 0;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n ; j++) {
                    if (matr[i][j] > matr[i + 1][j]) {

                        int temp = matr[i][j];
                        matr[i][j] = matr[i + 1][j];
                        matr[i + 1][j] = temp;

                        k++;
                    }
                }
            }
        } while (k > 0);

        System.out.println();
        System.out.println("По возрастанию - ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matr[i][j] + "\t");
            }
            System.out.println();
        }

        do {
            k = 0;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n ; j++) {
                    if (matr[i][j] < matr[i + 1][j]) {

                        int temp = matr[i][j];
                        matr[i][j] = matr[i + 1][j];
                        matr[i + 1][j] = temp;

                        k++;
                    }
                }
            }
        } while (k > 0);

        System.out.println();
        System.out.println("По убыванию - ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matr[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
