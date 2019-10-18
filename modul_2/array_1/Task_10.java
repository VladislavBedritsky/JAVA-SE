package modul_2.array_1;

import java.util.Arrays;
import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);                                       //10.
        System.out.println("Ввведите количество элементов = ");
        int n = scr.nextInt();
        int[] array = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.println("Введите число а" + i + " = ");
            array[i] = scr.nextInt();
        }

        for (int j = 1; j < n; j +=  2) {
            array[j] = 0;
        }
        System.out.println("Наши числа = "+ Arrays.toString(array));

        for (int i = 1, j = 1; i < n; i++, j++) {
            if (i + j < array.length) {
                array[i] = array[i + j];
            } else {
                array[i] = 0;
            }
        }
        for ( int temp : array) {
            if (temp != 0) {
                System.out.printf("%3d ", temp);
            } else break;
        }
    }
}
