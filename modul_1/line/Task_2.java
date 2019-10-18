package modul_1.line;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        //2.

        double z, a, b, c;

        Scanner scr = new Scanner(System.in) ;
        do {
            System.out.print("Введите a = ");
            a = scr.nextDouble();
            if (a == 0) {
                System.out.println("a не может = 0 ");
            }
        } while (a == 0);

        System.out.print("Введите b = ");
        b = scr.nextDouble();

        System.out.print("Введите c = ");
        c = scr.nextDouble();

        z = b + Math.sqrt(b*b + 4*a*c);
        z /= 2*a ;
        z += Math.pow(b,-2) - Math.pow (a,3)*c;

        System.out.print(" z = " + z);

    }
}
