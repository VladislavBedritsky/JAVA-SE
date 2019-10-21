package modul_2.decomposition;

import java.util.Arrays;
import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {

        int[]array = arrayOfNum();
        System.out.println("Наши числа - "+Arrays.toString(array));
        System.out.println("Наибольший общий делитель = "+gsd(array));
        trueOrFalse(gsd(array));
    }
    private static int[] arrayOfNum () {
        Scanner scr = new Scanner(System.in);
        int[]array = new int[3];
        for (int i = 0; i < 3;i++) {
            array[i] =(int) (Math.random()*30);
        }
        return array;
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
    private static void trueOrFalse (int gsd) {
        if (gsd == 1) {
            System.out.println("Наши числа взаимно простые, так как их НОД = 1");
        }else System.out.println("Наши числа не взаимно простые,т.к. НОД > 1");
    }

}
