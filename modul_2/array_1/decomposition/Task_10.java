package modul_2.decomposition;

import java.util.Arrays;
import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите n - ");
        int n = scr.nextInt();
        System.out.println("Result - "+Arrays.toString(array(n)));
    }
    public static int[] array (int n) {
        int[]arr=new int[10];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()+n);
        }
        return arr;
    }
}
