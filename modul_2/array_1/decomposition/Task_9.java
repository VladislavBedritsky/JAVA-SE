package modul_2.decomposition;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {

        int a,b,z,t;
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите x - ");
        a = scr.nextInt();
        System.out.println("Введите y - ");
        b = scr.nextInt();
        System.out.println("Введите z - ");
        z = scr.nextInt();
        System.out.println("Введите t - ");
        t = scr.nextInt();
        System.out.print("Площадь = "+s(z,t,a,b));
    }
    private static double findS_1 (int a, int b) {
        return a*b/2;
    }
    private static double gipotenuza (int a,int b) {
        return Math.sqrt(a*a + b*b);
    }
    private static double poluperimetr (int z,int t,int a ,int b) {
        return (z + t + gipotenuza(a,b)/2);
    }
    private static double findS_2 (int z,int t,int a ,int b) {
        return Math.sqrt(poluperimetr(z, t, a, b)*(poluperimetr(z, t, a, b) - z)*(poluperimetr(z, t, a, b) - t)*(poluperimetr(z, t, a, b) - gipotenuza(a, b)));
    }
    private static double s (int z,int t,int a ,int b) {
        return findS_1(a, b)+findS_2(z, t, a, b);
    }
}
