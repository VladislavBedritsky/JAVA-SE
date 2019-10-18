package modul_1.vetvl;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        //1.

        double a,b;
        Scanner scr = new Scanner(System.in);

        System.out.println("Введите 1 угол в градусах - ");
        a = scr.nextDouble();
        System.out.println("Введите 2 угол в градусах - ");
        b = scr.nextDouble();

        if (a + b >= 180 || a == 0 || b == 0) {
            System.out.println("Такого треугольника не существует");
        }else if (a == 90  || b == 90 || a + b == 90) {
            System.out.println("Треугольник - прямоугольный");
        } else System.out.println("Треугольник существует");

    }
}
