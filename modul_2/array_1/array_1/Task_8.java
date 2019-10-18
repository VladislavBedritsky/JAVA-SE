package modul_2.array_1;

import java.util.Arrays;
import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {

        Scanner scr = new Scanner (System.in);                              //8.
        System.out.println("Ввведите количество элементов = ");
        int n = scr.nextInt();
        int[] array = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.println("Введите число а" + i + " = ");
            array[i] = scr.nextInt();
        }
        int min = array[0];
        for(int i = 0; i < n; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Минимальное число = "+min);
        int k = 0;
        for(int i = 0;i < n; i++) {
            if (array[i] != min) {
                k++;
            }
        }
        System.out.println("Наши числа = "+ Arrays.toString(array));

        int[] newArr = new int[k];
        int num = 0;
        for(int i = 0;i < n;i++){
            if(array[i] != min) {
                newArr[num] = array[i];
                num++;
            }
        }
        System.out.println("Result = "+Arrays.toString(newArr));
    }
}
