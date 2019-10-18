package modul_1.line;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        // 1.

        double z, a, b, c ;

        Scanner scr = new Scanner(System.in) ;
        System.out.print("Введите a = ");
        a = scr.nextDouble();

        System.out.print("Введите b = ");
        b = scr.nextDouble();

        System.out.print("Введите c = ");
        c = scr.nextDouble();

        z = ((a - 3)*b/2) + c;

        System.out.println("Значение z = "+z);

    }
}
