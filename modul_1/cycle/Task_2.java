package modul_1.cycle;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
         double a ,b , h;

        Scanner scr = new Scanner(System.in);
        System.out.println("Введите a - ");
        a = scr.nextDouble();
        System.out.println("Введите b - ");
        b = scr.nextDouble();
        System.out.println("Введите h - ");
        h = scr.nextDouble();

        while (a <= b) {
            if (a <= 2) {
                System.out.println((float) -a);
            } else {
                System.out.println((float) a);
            }
            a += h;
        }
    }
}