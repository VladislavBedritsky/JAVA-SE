package modul_2.array_2;

import java.util.Arrays;
import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);                                           // 9.
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

        int[] array = new int[n];
        int sum = 0;
        for (int j = n - 1; j >= 0; j--) {
            for (int i = 0; i < n; i++) {
                sum += matr[i][j];
                array[j] = sum;
            }
            sum = 0;
        }

        System.out.println("Сумма каждого столбца - "+ Arrays.toString(array));
        int max = array[0];
        int elmax = 0;
        for (int j = 0; j < n; j++) {
            if (max < array[j]) {
                max = array[j];
                elmax = j ;
            }
        }
        System.out.println("Максимальной сумма - "+max+", у столбца с номером - "+elmax);

    }
}
