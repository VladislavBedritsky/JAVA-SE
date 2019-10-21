package modul_2.decomposition;

import java.util.Arrays;
import java.util.Scanner;

public class Task_15 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int[] array = {678,954,345,454,891,234,323};
        System.out.println("Наши числа - "+ Arrays.toString(array));
        result(array);
    }

    private static int[] amountOfDigits (int x) {
            int[]arr = new int[3];
            for (int i = 3;i > 0;i--) {
                arr[i - 1] = x%10;
                x /= 10;
            }
            return arr;
    }
    private static void result (int[] array) {
        int k = 0;
        System.out.println("Result - ");
        for(int tmp:array){
            for(int j = 0;j < amountOfDigits(tmp).length - 1;j++){
                if (amountOfDigits(tmp)[j] == (amountOfDigits(tmp)[j+1] - 1)) {
                    k++;
                }
            }
            if(k == 2) {
                System.out.printf("%4d",tmp);
            }
            k = 0;
        }
    }

}
