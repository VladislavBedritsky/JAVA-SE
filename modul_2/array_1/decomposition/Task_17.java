package modul_2.decomposition;

import java.util.Scanner;

public class Task_17 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Наше число - ");
        int n = scr.nextInt();

        System.out.print("Количество = "+amountNumb(n)+" раз(а)");
    }
    private static int amountNumb (int n) {                //размер числа
        int r = 0;
        do {
            n -= sum(n);
            r++;
        } while(n != 0);
        return r;
    }
    private static int sum (int n) {
       int sum = 0;
       while (n > 0) {
           sum += n%10;
           n/=10;
       }
       return sum;
    }

}
