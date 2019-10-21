package modul_2.decomposition;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Число 1 - ");
        int a = scr.nextInt();
        System.out.println("Число 2 - ");
        int b = scr.nextInt();
        int nod = gcd(a,b);
        System.out.println("Наибольший общий делитель: " + nod);
        int nok = lcm(a, b);
        System.out.println("Наименьшее общее кратное: " + nok);
    }

        private static int gcd(int a, int b) {
            while (b !=0 && a != 0) {
                if (a > b) {
                    a = a % b;
                }else  {
                    b = b % a;
                }
            }
            a = a + b;
            return a;
        }

    private static int lcm(int a, int b) {
        return a*b/gcd(a,b);
    }

}
