package modul_2.sort;

import java.util.Arrays;
import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Количество дробей - ");
        int a = scr.nextInt();
        int[] numerator = new int[a];
        int[] denominator = new int[a];
        for (int i = 0; i < a; i++) {
            numerator[i] = (int) (Math.random() * 10);
            denominator[i] = (int) (Math.random() * 20 + 10);
        }
        System.out.println("Числители - ");
        System.out.println(Arrays.toString(numerator));
        System.out.println("Знаменатели - ");
        System.out.println(Arrays.toString(denominator));

        //общий знаменатель...
        int n = 1;
       for (int i = 0;i < a;i++){
            n *= denominator[i];
        }
        // числитель*знаменатель
        int[]arrayNum = new int[a];
        for(int i = 0;i < a;i++){
            arrayNum[i] = numerator[i]*n;
        }
        Arrays.sort(arrayNum);
        System.out.println("Числители в порядке возрастания - "+Arrays.toString(arrayNum)+" с общим знаменателем - "+n);

    }
}
