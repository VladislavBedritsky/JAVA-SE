package modul_1.line;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {

        //4.

        int n, d;
        double  r, nnn , ddd;

        Scanner scr = new Scanner(System.in) ;
        do {
            System.out.print("Введите n = ");
             n = scr.nextInt();
             if (n < 0 || n > 9) {
                 System.out.println("Введите число от 0 до 9");
             }
        } while (n < 0 || n > 9);
        do {
            System.out.print("Введите d = ");
            d = scr.nextInt();
            if (d < 0 || d > 9) {
                System.out.println("Введите число от 0 до 9");
            }
        }while (d < 0 || d > 9);

        nnn = 100*n + 10*n + n;
        ddd = 100*d + 10*d +d;

        r = nnn + ddd/1000;
        System.out.println("Данное r = "+r);

        r = ddd + nnn/1000;
        System.out.println("Конечное r = "+r);
    }
}
