package modul_2.array_2;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {

        Scanner scrN = new Scanner(System.in);                                           // 3.
        System.out.println("Введите количество строк вашей матрицы - ");
        int n = scrN.nextInt();
        System.out.println("Введите количество столбцов вашей матрицы - ");
        int m = scrN.nextInt();
        int [][] matr = new int [n][m];

        System.out.println("Наша матрица - ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matr[i][j] = (int)(Math.random()*1000);
                System.out.print(matr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Какую сроку по счету хотим вывести(счет от 0) ? - ");
        int k = scrN.nextInt();
        System.out.println("Вывод нашей строки - ");
        for (int i = k - 1; i <= k - 1 ;i++ ) {
            for (int j = 0; j < m; j++) {
                System.out.print(matr[k][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Какой столбец по счету хотим вывести(счет от 0) ? - ");
        int p = scrN.nextInt();
        System.out.println("Вывод нашего столбца - ");
        for (int i = 0; i < n; i++) {
            for (int j = p - 1; j <= p - 1; j++) {
                System.out.print(matr[i][p] + "\t");
            }
            System.out.println();
        }

    }
}
