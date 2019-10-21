package modul_2.decomposition;

import java.util.Arrays;
import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Размер массива - ");
        int n = scr.nextInt();
        int[] array = arrayD(n);
        System.out.println("Наши числа"+Arrays.toString(array));
        System.out.print("Введите номера строк через пробел");
        System.out.println();
        int k = scr.nextInt();
        int m = scr.nextInt();
        System.out.println("Сумма чисел между введенных строк = "+amount(array,k,m,n));
    }

    private static int[] arrayD (int n) {
        int[] arr = new int[n];
        for(int i = 0;i < n; i++) {
            arr[i] = (int) (Math.random()*20);
        }
        return arr;
    }
    private static int amount (int[]array,int k ,int m,int n) {
        int sum = 0;
        for (int i = k;i <= m;i++) {
            sum += array[i];
        }
        return sum;
    }

}
