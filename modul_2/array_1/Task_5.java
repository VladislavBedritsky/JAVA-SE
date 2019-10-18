package modul_2.array_1;

import java.util.Arrays;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {

        Scanner scr = new Scanner (System.in);                              //5.
        System.out.println("Ввведите количество элементов = ");
        int n = scr.nextInt();
        int[] array = new int[n];
        int k = 0;
        for(int i = 0; i < n; i++) {
            System.out.println("Введите число а" + i + " = ");
            array[i] = scr.nextInt();
            if(array[i] > i) {
                k++;
            }
        }
        System.out.println("Наши числа = "+ Arrays.toString(array));

        int[] newArr = new int[k];
        int num = 0;
        for(int i = 0;i < n;i++){
            if(array[i]>i) {
                newArr[num] = array[i];
                num++;
            }
        }
        System.out.println("Result = "+Arrays.toString(newArr));

    }
}
