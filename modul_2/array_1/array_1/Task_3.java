package modul_2.array_1;

import java.util.Arrays;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {

        Scanner scr = new Scanner (System.in);                              //3.
        System.out.println("Ввведите количество элементов = ");
        int n = scr.nextInt();
        int[] array = new int[n];
        int zero = 0;
        int pol = 0;
        int otr = 0;

        for(int i = 0; i < n; i++) {
            System.out.println("Введите число а" + i + " = ");
            array[i] = scr.nextInt();
            if (array[i] == 0){
                zero++;
            } else if (array[i] > 0) {
                pol++;
            } else {
                otr++;
            }
        }
        System.out.println("Наши числа = "+ Arrays.toString(array));
        System.out.println("Элементы равные 0 = "+zero);
        System.out.println("Количество отрицательные элементов = "+otr);
        System.out.println("Количество положительных элементов = "+pol);

    }
}
