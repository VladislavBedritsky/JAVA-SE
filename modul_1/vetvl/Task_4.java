package modul_1.vetvl;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {

        //4.

        double a,b,x,y,z;

        Scanner scr = new Scanner(System.in);

        System.out.println("a = ");
        a = scr.nextDouble();
        System.out.println("b = ");
        b = scr.nextDouble();
        System.out.println("x = ");
        x= scr.nextDouble();
        System.out.println("y = ");
        y = scr.nextDouble();
        System.out.println("z = ");
        z = scr.nextDouble();

        if ((a > x && b > y) || (a > x && b > z) || (a > z && b > y)) {
            System.out.println("Кирпич пройдет через отверстие.");
        } else {
            System.out.println("Кирпич не пройдет через отверстие.");
        }

    }
}
