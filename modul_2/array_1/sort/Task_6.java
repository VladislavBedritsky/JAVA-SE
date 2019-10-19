package modul_2.sort;

import java.util.Arrays;
import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Сколько чисел в последовательности - ");
        int a = scr.nextInt();
        int[] arr = new int[a];

        for (int i = 0; i < a; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println("Наш массив - ");
        System.out.println(Arrays.toString(arr));

        int k = a/2;                                               // метод Шелла
        while (k > 0 ) {
            for (int i = 0; i < a - k; i++) {
                int j = i;
                while (j >= 0 && (arr[j] > arr[j + k])) {
                    int temp = arr[j];
                    arr[j] = arr[j + k];
                    arr[j + k] = temp;
                    j--;
                }
            }
            k=k/2;
        }
        System.out.println("Result - ");
        System.out.println(Arrays.toString(arr));
    }
}
