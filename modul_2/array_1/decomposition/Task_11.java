package modul_2.decomposition;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите 1 число - ");
        int a = scr.nextInt();
        System.out.println("Введите 2 число - ");
        int b = scr.nextInt();
        print(a,b);
    }
    public static void print (int a,int b) {
        int k = 0;
        do {
            a /= 10;
            k++;
        }while (a != 0);

        int l = 0;
        do {
            b /= 10;
            l++;
        }while (b != 0);

        if (k > l) {
            System.out.println("В числе А больше цифр("+k+"), чем в числе В("+l+")");
        }else if (k < l) {
            System.out.println("В числе А меньше цифр("+k+"), чем в числе В("+l+")");
        }else {
            System.out.println("В числе А одинаковое количество цифр("+k+"), как и в числе В("+l+")");
        }
    }
}
