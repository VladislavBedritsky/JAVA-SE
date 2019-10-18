package modul_2.array_1;

import java.util.Arrays;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        Scanner scr = new Scanner (System.in);                              //2.
        System.out.println("Ввведите количество элементов = ");
        int n = scr.nextInt();
        System.out.println("Введите чилсло Z = ");
        int z = scr.nextInt();
        int[] array = new int[n];
        int sum = 0;

        for(int i = 0; i < n; i++) {
            System.out.println("Введите число а" + i + " = ");
            array[i] = scr.nextInt();
            if (array[i] > z) {
                array[i] = z;
                sum++;
            }
        }
        System.out.println("Result = "+ Arrays.toString(array)+" Число Z = "+z);
        System.out.println("Количество замен "+sum);

    }
}
