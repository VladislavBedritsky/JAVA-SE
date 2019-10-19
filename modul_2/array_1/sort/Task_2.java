package modul_2.sort;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Сколько чисел в первой последовательности - ");
        int a = scr.nextInt();
        System.out.println("Сколько чисел во второй последовательности - ");
        int b = scr.nextInt();
        int[] arrA = new int[a];
        int[] arrB = new int[b];

        System.out.println("Введите числа в порядке возрастания");
        for (int i = 0; i < a; i++) {
            System.out.println("Введите число а" + i + " = ");
            arrA[i] = scr.nextInt();
        }

        System.out.println("Введите числа в порядке возрастания");
        for (int i = 0; i < b; i++) {
            System.out.println("Введите число b" + i + " = ");
            arrB[i] = scr.nextInt();
        }
        System.out.println("Наши массивы - ");
        System.out.println(Arrays.toString(arrA));
        System.out.println(Arrays.toString(arrB));

/*        int[] array = new int[a+b];                //  способ с массивом
        for (int i = 0; i < a+b; i++) {
            if (i < a) {
                array[i] = arrA[i];
            } else {
                array[i] = arrB[i - a];
            }
        }
        System.out.println("Resul - ");
        for (int i = 0;i < a+b;i++) {
            for (int j = i + 1; j < a+b;j++) {
                if (array[j]<array[i]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
*/

                     // способ 2 - без дополнительного массива

        for (int i = 0;i < a;i++) {
            for (int j = 0; j < b;j++) {
                if (arrA[i] > arrB[j]) {
                    int tmp = arrB[j];
                    arrB[j] = arrA[i];
                    arrA[i] = tmp;
                }
            }
        }

        for (int i = 0;i < b;i++) {
            for (int j = i + 1; j < b;j++) {
                if (arrB[i] > arrB[j]) {
                    int tmp = arrB[j];
                    arrB[j] = arrB[i];
                    arrB[i] = tmp;
                }
            }
        }

        System.out.println("Resul - ");
        for (int i = 0;i < a;i++) {
            System.out.printf("%-3d",arrA[i]);
        }
        for (int j = 0; j < b;j++) {
            System.out.printf("%-3d",arrB[j]);
        }

    }
}