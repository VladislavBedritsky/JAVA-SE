package modul_2.array_1;

import java.util.Arrays;
import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {

        Scanner scr = new Scanner (System.in);                              //6.
        System.out.println("Ввведите количество элементов = ");
        int n = scr.nextInt();
        double[] array = new double[n];
        double sum = 0;
        for(int i = 0; i < n; i++) {
            System.out.println("Введите число а" + i + " = ");
            array[i] = scr.nextDouble();
            if(check(i)) {
                sum += array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Сумма чисел(порядковый номер - простое число) = "+sum);
    }

    static boolean check(int i) {                                // Проверка простых чисел!!!
        if(i == 1 || i == 0)
            return false;
        for (int j = 2;j <= Math.sqrt(i);j++) {
            if(i%j == 0)
                return false;
        }
        return true;
    }

}
