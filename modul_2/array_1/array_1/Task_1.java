package modul_2.array_1;

import java.util.Arrays;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        //1.

        Scanner scr = new Scanner (System.in);
        System.out.println("Ввведите количество элементов матрицы = ");
        int n = scr.nextInt();
        System.out.println("Введите чилсло K = ");
        int k = scr.nextInt();
        int[] arr = new int[n];
        int sum = 0;

        for(int i = 0; i < n; i++) {
            System.out.println("Введите число а"+i+" = ");
            arr[i] = scr.nextInt();
            if (arr[i]%k == 0) {
                sum += arr[i];
            }
        }
        System.out.println("Наш массив"+ Arrays.toString(arr));
        System.out.println("Сумма всех элементов матрицы кратных K = "+sum);

    }
}
