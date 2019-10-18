package modul_1.cycle;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {

        //5.

        double sum = 0, a, e;
        Scanner scr = new Scanner(System.in) ;

        System.out.println("Введите e = ");
        e = scr.nextDouble();

        for(int n = 0; n <= 1000; n++ ) {
            a = (1/Math.pow(2,n)) + (1/Math.pow(3,n));
            if (Math.abs(a) >= e) {
                sum += a;
            } else
                break;
        }

        System.out.println("Наша сумма = "+sum);


    }
}
