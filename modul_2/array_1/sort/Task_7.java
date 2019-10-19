package modul_2.sort;

import java.util.Arrays;
import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Сколько чисел в 1 последовательности - ");
        int a = scr.nextInt();
        System.out.println("Сколько чисел вo 2 последовательности - ");
        int b = scr.nextInt();
        int[] arrA = new int[a];
        int[] arrB = new int[b];

        for (int i = 0; i < a; i++) {
            arrA[i] = (int) (Math.random() * 100);
        }
        System.out.println("1 массив - ");
        System.out.println(Arrays.toString(arrA));

        for (int i = 0; i < b; i++) {
            arrB[i] = (int) (Math.random() * 100);
        }
        System.out.println("2 массив - ");
        System.out.println(Arrays.toString(arrB));

        int[] array = new int[a+b];

        for (int i = 0; i < a+b; i++) {
            if (i < a) {
                array[i] = arrA[i];
            } else {
                array[i] = arrB[i - a];
            }
        }

        System.out.println("Result - ");
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

        int position = 0;

        for(int i = 0; i < b;i++) {
            for(int j = 0; j <a+b;j++) {
                if (arrB[i] == array[j] ) {
                    System.out.println("Число "+arrB[i]+" на позицию - "+j);
                }
            }
        }

    }
}
