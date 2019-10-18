package modul_2.array_1;

import java.util.Arrays;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {

        Scanner scr = new Scanner (System.in);                              //4.
        System.out.println("Ввведите количество элементов = ");
        int n = scr.nextInt();
        int[] array = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.println("Введите число а" + i + " = ");
            array[i] = scr.nextInt();
        }
        int min = array[0];
        int max = array[0];
        int elMin = 0;
        int elMax = 0;

        for (int j = 0; j < n; j++) {
            if (min > array[j]) {
                min = array[j];
                elMin = j;
            }
        }
        for (int j = 0; j < n; j++) {
            if (max < array[j]) {
                max = array[j];
                elMax = j;
            }
        }
        System.out.println("Наши числа = "+ Arrays.toString(array));
        int temp = array[elMin];
        array[elMin] = array[elMax];
        array[elMax] = temp;

        System.out.println("Минимальное число = " + min);
        System.out.println("Максимальное число = " + max);
        System.out.println("Result = "+ Arrays.toString(array));

    }
}
