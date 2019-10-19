package modul_2.sort;

import java.util.Arrays;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {

        // сортировка выбором

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
        for (int i = 0;i < a;i++) {
            for (int j = i + 1; j < a;j++) {
                if (arrA[i] < arrA[j]) {
                    int tmp = arrA[j];
                    arrA[j] = arrA[i];
                    arrA[i] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arrA));
    }
}
