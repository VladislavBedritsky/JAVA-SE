package modul_1.line;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {

        //6.

        double x,y;
        boolean br ;

        Scanner scr = new Scanner(System.in) ;
        System.out.println("Введите x = ");
        x = scr.nextDouble();

        System.out.println("Введите y = ");
        y = scr.nextDouble();

        br = (x >= -4 && x <= 4 && y >= -3 && y <= 0) || (x >= -2 && x <= 2 && y >= 0 && y <= 4);
            System.out.println(br);

    }
}
