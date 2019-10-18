package modul_1.vetvl;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {

        //5.

        double f,x;

        Scanner scr = new Scanner(System.in);

        System.out.println("x = ");
        x = scr.nextDouble();

        if (x <=3) {
            f = x*x - 3*x + 9;
        } else {
            f = 1 / (Math.pow(x,3) + 6);
        }

        System.out.println("F(x) = "+f);
    }
}
