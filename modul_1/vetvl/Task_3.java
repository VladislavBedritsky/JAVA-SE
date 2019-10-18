package modul_1.vetvl;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {

        //3.

        double x1,y1,x2,y2,x3,y3,a, b, c, p, s;

        Scanner scr = new Scanner(System.in);

        System.out.println("x1 = ");
        x1 = scr.nextDouble();
        System.out.println("y1 = ");
        y1 = scr.nextDouble();
        System.out.println("x2 = ");
        x2 = scr.nextDouble();
        System.out.println("y2 = ");
        y2 = scr.nextDouble();
        System.out.println("x3 = ");
        x3 = scr.nextDouble();
        System.out.println("y3 = ");
        y3 = scr.nextDouble();

        // Образуем из трех точек треугольник. a,b,c - стороны треугольника.p - полу-периметр
        // s - площадь. Площадь вычисляем по формуле Герона(если равна 0, то лежат)

        a = Math.sqrt( Math.pow((x1 - x2),2) + Math.pow((y1 - y2),2) );  // Вычисляем длину отрезков по т.Пифагора
        b = Math.sqrt( Math.pow((x2 - x3),2) + Math.pow((y2 - y3),2) );
        c = Math.sqrt( Math.pow((x3 - x1),2) + Math.pow((y3 - y1),2) );

        p = (a + b + c) / 2;
        s = Math.sqrt(p*(p - a)*(p - b)*(p -c));

        if (s == 0) {
            System.out.println("Точки лежат на одной прямой");
        } else {
            System.out.println("Точки не лежат на одной прямой");
        }

    }
}
