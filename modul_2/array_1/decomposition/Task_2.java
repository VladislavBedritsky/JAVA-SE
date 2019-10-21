package modul_2.decomposition;

import java.util.Arrays;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        int[] array = arrElements(4);
        System.out.println(Arrays.toString(array));
        int nod = gsd(array);
        System.out.println("Наибольший общий делитель: " + nod);
    }
    private static int [] arrElements (int n)  {
        Scanner scr = new Scanner(System.in);
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите число a" + (i + 1) + ":");
            arr[i] = scr.nextInt();
        }
        return arr;
    }

    private static int gsd(int [] array) {
        int a = array[0];
        for (int tmp : array) {
            int b = tmp;

            while (b !=0 && a != 0) {
                if (a > b) {
                    a = a % b;
                }else  {
                    b = b % a;
                }
            }
            a = a + b;
        }
        return a;
    }
}
