package modul_1.cycle;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {

        //7.
        int n, m;

        Scanner scr = new Scanner(System.in);
       do {
           System.out.println("Введите натуральное число n - ");
           n = scr.nextInt();
           System.out.println("Введите натуральное число m - ");
           m = scr.nextInt();
           if (m < n) {
               System.out.println("Число m меньше чем n");
           }
       } while (m < n);

       for (int i = n ; i <= m ; i++) {
           System.out.println("Ваше число = "+i);
           for (int j = 2; j < i; j++) {
               int b = i%j;
               if (b == 0) {
                   System.out.println("Делитель: "+j);
               }
           }

       }

    }
}
