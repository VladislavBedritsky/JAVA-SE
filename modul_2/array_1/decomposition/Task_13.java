package modul_2.decomposition;

import java.util.Arrays;
import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {
        int n;
        Scanner scr = new Scanner(System.in);
        do {
            System.out.println("Введите n - ");
            n = scr.nextInt();
            if (n < 2) {
                System.out.println("n меньше чем 2");
            }
        }while (n < 2);
        int[] arr = array(n);
        System.out.println(Arrays.toString(arr));
        result(n,arr);
    }
    private static int[] array (int n) {
        int[] arr = new int[3*n];
        for (int i = 0;i < arr.length;i++){
            arr[i] = (int) (Math.random()*20);
        }
        return arr;
    }

    private static void result (int n, int[] arr) {
        int k = 0;
        System.out.println("Наши пары:");
        for (int i = n;i <= 2*n;i++) {
            for(int j = n;j <= 2*n ;j++) {
                if (arr[i] == arr[j] + 2 ) {
                    System.out.println(arr[i]+"--"+arr[j]);
                    k++;
                }
            }
        }
        if (k == 0) {
            System.out.println("На этом промежутке таких пар чисел нету");
        }

    }


}
