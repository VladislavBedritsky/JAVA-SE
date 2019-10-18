package modul_1.vetvl;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        //2.

        double a,b,c,d,minAB,minCD,max;

        Scanner scr = new Scanner(System.in);

        System.out.println("a = ");
        a = scr.nextDouble();
        System.out.println("b = ");
        b = scr.nextDouble();
        System.out.println("c = ");
        c = scr.nextDouble();
        System.out.println("d = ");
        d = scr.nextDouble();

        minAB = Math.min(a,b);
        minCD = Math.min(c,d);

        max = Math.max(minAB,minCD);

        System.out.println("Минимальное число из a и b - "+minAB+"; Минимальное число из c и d - "+minCD+"; Максимальное число из минимальных двух - "+max);
    }
}
