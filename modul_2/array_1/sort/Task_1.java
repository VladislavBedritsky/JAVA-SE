package modul_2.sort;

import java.util.Arrays;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        int a;
        Scanner scr = new Scanner(System.in);
        do {
            System.out.println("Размер массива 1 - ");
            a = scr.nextInt();
            if (a < 2) {
                System.out.println("Размер 1 массива должен >= 2");
            }
        } while(a < 2 );
        System.out.println("Размер массива 2 - ");
        int b = scr.nextInt();
        int[] arrA = new int[a];
        int[] arrB = new int[b];

        for (int i = 0; i < a; i++) {
            arrA[i] = (int)(Math.random()*100);
        }
        System.out.println("1 массив - "+ Arrays.toString(arrA));

        for (int i = 0; i < b; i++) {
            arrB[i] = (int)(Math.random()*100);
        }
        System.out.println("2 массив - "+Arrays.toString(arrB));

        int k;
        do {
            System.out.print("K(от 0 до a-2) = ");
            k = scr.nextInt();
            if (k < 0 || k >= a - 1 ) {
                System.out.println("Число k не соответствует размеру 1 массива");
            }
        } while(k < 0 || k >= a - 1 );

        for (int i = 0; i < a; i++) {
            System.out.printf("%-3d",arrA[i]);
            if(i == k) {
                for (int j = 0; j < b; j++) {
                    System.out.printf("%-3d", arrB[j]);
                }
            }
        }

    }
}
