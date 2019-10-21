package modul_2.decomposition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите 1 число - ");
        int a = scr.nextInt();
        System.out.println("Введите 2 число - ");
        int b = scr.nextInt();
       array(a,b);

    }

    private static void array(int a,int b){
        int[] arr = new int[0];
        int sum=0;
        int numberArray = 1 + a;
        while (sum != a){
            arr = Arrays.copyOf(arr,arr.length+1);
            while((numberArray + sum) > a) {
                numberArray = 1 + (int) (Math.random() * (b));
            }
            sum += numberArray;
            arr[arr.length-1] = numberArray;
        }
        System.out.println("Массив - "+Arrays.toString(arr));

    }
}
