package modul_2.array_2;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        Scanner scrN = new Scanner(System.in);                                           // 1.
        System.out.println("Введите количество строк вашей матрицы - ");
        int n = scrN.nextInt();
        System.out.println("Введите количество столбцов вашей матрицы - ");
        int m = scrN.nextInt();
        int [][] matr = new int [n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Введите элемент matr[" + i + "][" + j + "]:");
                matr[i][j] = scrN.nextInt();
            }
        }
        System.out.println("Наша матрица - ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Нечетные столбцы, где 1 элемент столбца больше последнего - ");
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < m; j+=2 ) {
                if (matr[0][j] > matr[n-1][j]) {
                    System.out.print(matr[i][j] + "\t");
                }
            }
            System.out.println();
        }

    }
}
