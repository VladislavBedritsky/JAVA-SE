package modul_2.decomposition;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Сторона шестиугольника = ");
        int a = scr.nextInt();
        System.out.println("Площадь шестиугольника = "+sHexagon(a));
    }

    private static double sTriangle (double a) {
         return a*a*Math.sqrt(3)/4;
    }
    private static double sHexagon (double a) {
        return 6*sTriangle(a);
    }

}
