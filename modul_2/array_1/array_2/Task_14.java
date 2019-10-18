package modul_2.array_2;

import java.util.Scanner;

public class Task_14 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Число строк n - ");
        int n = scr.nextInt();
        System.out.println("Число столбцов m - ");
        int m = scr.nextInt();
        int [][] matr = new int [n][m];
        int k;

        for (int j = 0; j < m; j++) {
            k = j;
            for (int i = 0; i < n; i++) {
                if (k > 0) {
                    matr[i][j] = 1;
                    k--;
                } else {
                    matr[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
