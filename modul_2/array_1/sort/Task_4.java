package modul_2.sort;

import java.util.Arrays;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {

        //bubble sort

        Scanner scr = new Scanner(System.in);
        System.out.println("Сколько чисел в последовательности - ");
        int a = scr.nextInt();
        int[] arrA = new int[a];

        System.out.println("Введите числа в порядке возрастания:");
        for (int i = 0; i < a; i++) {
            System.out.println("Введите число а" + i + " = ");
            arrA[i] = scr.nextInt();
        }
        System.out.println("Наш массив - ");
        System.out.println(Arrays.toString(arrA));
        System.out.println("Resul - ");
        for (int i = a - 1;i > 0;i--) {
            for (int j = 0; j < i;j++) {
                if (arrA[j] < arrA[j+1]) {
                    int tmp = arrA[j];
                    arrA[j] = arrA[j+1];
                    arrA[j+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arrA));

    }
}
