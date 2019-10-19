package modul_2.sort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Сколько чисел в последовательности - ");
        int a = scr.nextInt();
        int[] arrA = new int[a];

        for (int i = 0; i < a; i++) {
            arrA[i] = (int) (Math.random() * 100);
        }
        System.out.println("Наш массив - ");
        System.out.println(Arrays.toString(arrA));

        Arrays.sort(arrA);
        System.out.println("Отсортированнный массив - " + Arrays.toString(arrA));

        int k = new Random().nextInt(arrA.length);
        System.out.println("Число из нашей последовательности, после которого будем вставлять наш элемент - " + arrA[k]);

        int firstIndex = 0;                                            // двоичный поиск позиции нашего числа в массиве
        int lastIndex = a - 1;
        int position = (firstIndex + lastIndex) / 2;

        while ((firstIndex <= lastIndex)&&(arrA[position] != arrA[k])) {

            if (arrA[position] > arrA[k]) {
                lastIndex = position - 1;
            } else {
                firstIndex = position + 1;
            }
            position = (firstIndex + lastIndex) / 2;
        }

        if(firstIndex<=lastIndex) {
            System.out.println("Позиция числа в списке = "+position);
        } else{
            System.out.println("Элемента в списке нет");
        }

        int element = (int) (Math.random() * 100);
        System.out.println("Элемент для массива = " + element);


        System.out.println("Resul - ");
        for (int i = 0;i < a;i++) {
            System.out.printf("%-3d",arrA[i]);
                if (i == position) {
                    System.out.printf("%-3d",element);
                }
        }

    }
}

