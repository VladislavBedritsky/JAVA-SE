package modul_2.array_2;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);                                           // 8.
        System.out.println("Введите переменную/размер матрицы n - ");
        int n = scr.nextInt();
        int [][] matr = new int [n][n];

        System.out.println("Наша матрица - ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matr[i][j] = (int) (Math.random()*1000);
                System.out.print(matr[i][j] + "\t");
            }
            System.out.println();
        }

        int s1,s2;
        do {
            System.out.println("Введите номер 1 столбца - ");
            s1 = scr.nextInt();
            if (s1 < 0 || s1 >= n) {
                System.out.println("Такого столбца не существует, повторите попытку: ");
                s1 = scr.nextInt();
            }
        } while (s1 < 0 || s1 >= n);
        do {
            System.out.println("Введите номер 2 столбца - ");
            s2 = scr.nextInt();
            if (s2 < 0 || s2 >= n) {
                System.out.println("Такого столбца не существует, повторите попытку ");
                s1 = scr.nextInt();
            }else if (s2 == s1) {
                System.out.println("Этот столбец уже выбран ");
            }
        } while (s2 < 0 || s2 >= n || s2 == s1);

        for (int i = 0; i < n; i++) {
            int temp = matr[i][s1];
            matr[i][s1] = matr[i][s2];
            matr[i][s2] =  temp;
        }

        System.out.println("Наша матрица - ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%-4d",matr[i][j]);
            }
            System.out.println();
        }

    }
}
