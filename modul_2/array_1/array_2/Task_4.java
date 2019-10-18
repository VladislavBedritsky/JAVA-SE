package modul_2.array_2;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {

        int n;
        Scanner scr = new Scanner(System.in);                                           // 4.
        do {
            System.out.println("Введите переменную(чётное число)/размер матрицы n - ");
            n = scr.nextInt();
            if (n%2 != 0) {
                System.out.println("Ваше число нечётное");
            }
        }while (n%2 != 0);

        int [][] matr = new int [n][n];
        int k = 1;
        int r = n;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 != 0) {
                    matr[i][j] = r;
                    r--;
                    matr[i][n - 1] = 1;
                } else {
                    matr[i][j] = k;
                    k++;
                    matr[i][n - 1] = n;
                }
            }
            r = n;
            k = 1;
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
