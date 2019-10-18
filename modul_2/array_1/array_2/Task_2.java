package modul_2.array_2;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        Scanner scrN = new Scanner(System.in);                                           // 2.
        System.out.println("Введите количество строк/столбцов вашей матрицы - ");
        int n = scrN.nextInt();
        int [][] matr = new int [n][n];

        System.out.println("Наша матрица - ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matr[i][j] = (int)(Math.random()*1000);
                System.out.print(matr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Числа по диагонал слева направо - ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == j)
                    System.out.print(matr[i][j] + "\t");
            }
        }
        System.out.println("");
        System.out.println("Числа по диагонал справа налево - ");
        for (int i = 0; i < n; i++) {
            for (int j = n - 1 - i; j >= n - 1 - i;j--) {
                System.out.print(matr[i][j] + "\t");
            }
        }

    }
}
