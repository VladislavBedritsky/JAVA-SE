package modul_2.decomposition;

import java.util.Arrays;
import java.util.Scanner;

public class Task_14 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Промежуток - ");
        int k = scr.nextInt();
        result(k);
    }
    private static int amountNumb (int x) {
        int r = 0;
        do {
            x = x / 10;
            r++;
        } while(x != 0);
        return r;
    }
    private static int[] number (int x) {
         int[]arr = new int[amountNumb(x)];
         for (int g = amountNumb(x);g > 0;g--) {
            arr[g - 1] = x%10;
            x /= 10;
         }
         return arr;
    }
    private static void result (int k ) {
        int sum = 0;
        int f = 0;
        System.out.println("Числа Армстронга:");
        for(int i = k;i > 0;i--) {

            for (int j = 0; j < amountNumb(i);j++) {
                sum += Math.pow(number(i)[j], amountNumb(i));
            }

            if (i == sum) {
                f++;
                System.out.printf("%-7d",i);
            }
            sum = 0;
        }
        if (f == 0) {
            System.out.println("В данном промежутке чисел Армстронга нету");
        }
    }

}
