package modul_1.line;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {

        //5.

        int h, m, s;

        Scanner scr = new Scanner(System.in);
        do {
            System.out.print("В котором часу - ");
            h = scr.nextInt();
            if (h < 0 || h > 23) {
                System.out.println("Такого времени не существует - ");
            }
        } while(h < 0 || h > 24 );
        do {
            System.out.print("В какую минуту - ");
            m = scr.nextInt();
            if (m < 0 || m > 59) {
                System.out.println("Такого времени не существует - ");
            }
        } while (m < 0 || m > 59);
        do {
            System.out.print("В какую секунду - ");
            s = scr.nextInt();
            if (s < 0 || s > 59) {
                System.out.println("Такого времени не существует - ");
            }
        } while (s < 0 || s > 59);
        System.out.println("Ваше время - " + h + "hh " + m + "mm " + s + "ss ");

    }
}