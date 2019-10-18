package modul_2.array_1;

import java.util.Arrays;
import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {

        Scanner scr = new Scanner (System.in);                              //9.
        System.out.println("Ввведите количество элементов = ");
        int n = scr.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.println("Введите число а" + i + " = ");
            array[i] = scr.nextInt();
        }
        System.out.println(Arrays.toString(array));

        int mostCount = 1 ;                                      //поиск наиболее часто встречающегося числа
        int count = 1;
        int mostCommon = array[0];
        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < n; j++) {
                if (i == j) continue;
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count > mostCount) {
                mostCommon = array[i];
                mostCount = count;
            } else if (count == mostCount) {
                if (array[i] < mostCommon) {
                    mostCommon = array[i];
                }
            }
            count = 1;
        }

        System.out.printf("%nНаиболее часто встречающееся наименьшее число:" +
                " %d.%nОно встречается %d раз(а)", mostCommon, mostCount);


    }
}
