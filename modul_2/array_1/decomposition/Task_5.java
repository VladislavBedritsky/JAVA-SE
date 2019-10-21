package modul_2.decomposition;

import java.util.Arrays;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Размер матрицы - ");
        int n = scr.nextInt(); //
        int [] array = doArray(n);
        System.out.println("Наши числа - ");
        System.out.println(Arrays.toString(array));
        System.out.println("2 по величине элемент = "+ourElement(array,n));
    }

    private static int[] doArray (int n) {
        int[] array = new int[n];
        for(int i = 0;i < n;i++) {
            array[i] = (int) (Math.random()*100);
        }
        return array;
    }
     private static int ourElement (int[] array,int n) {
        int k = 0;
        Arrays.sort(array);
        for(int tmp:array) {
            tmp = array[n-2];
            k = tmp;
        }
        return k;
     }

}
