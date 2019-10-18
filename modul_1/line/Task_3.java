package modul_1.line;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {

        //3.

        double z, x, y ;

        Scanner scr = new Scanner(System.in) ;
        System.out.print("Введите x = ");
        x = scr.nextDouble();

        System.out.print("Введите y = ");
        y = scr.nextDouble();

        z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y));
        z *= Math.tan(x*y);

        System.out.print("z = " + z);
    }
}
