package modul_2.array_2;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {

        int n;
        Scanner scr = new Scanner(System.in);                                           // 6.
        do {
            System.out.println("Введите переменную(чётное число)/размер матрицы n - ");
            n = scr.nextInt();
            if (n%2 != 0) {
                System.out.println("Ваше число нечётное");
            }
        }while (n%2 != 0);

        int [][] matr = new int [n][n];
        System.out.println("Наша матрица - ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((j >= i && j + i < n ) || ( j <= i && j + i >= n - 1)) {
                    matr[i][j] = 1;
                } else {
                    matr[i][j] = 0;
                }
                System.out.print(matr[i][j]+ "\t");
            }
            System.out.println();
        }

    }
}
