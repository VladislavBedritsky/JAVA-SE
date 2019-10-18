package modul_1.cycle;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        //1.

        Scanner scr = new Scanner(System.in) ;
        int x;
        do {
            System.out.println("Введите целое положительное число - ");
            x = scr.nextInt();
            if (x < 0) {
                System.out.println("Это не положительное число");
            }
        } while (x < 0);

        int sum = 0;
        if (x > 1) {
            for (int i = 1; i <= x ; i++) {
                sum += i;
            }
            System.out.println("Cумма чисел от 1 до вашего числа = "+sum);
        }else {
            System.out.println("Ваше число = 0 или 1 - невозможно посчитать сумму от 1 до вашего числа");
        }

    }
}
