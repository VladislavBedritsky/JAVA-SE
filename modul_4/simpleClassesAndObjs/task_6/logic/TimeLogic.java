package modul_4.simpleClassesAndObjs.task_6.logic;

import java.util.Scanner;

public class TimeLogic {

    public int ourHour () {
        Scanner scr = new Scanner(System.in);
        System.out.println("Час:");
        int h = scr.nextInt();
        if(h < 0 || h > 23) {
            h = 0;
        }
        return h;
    }
    public int ourMin () {
        Scanner scr = new Scanner(System.in);
        System.out.println("Минута:");
        int h = scr.nextInt();
        if(h < 0 || h > 59) {
            h = 0;
        }
        return h;
    }
    public int ourSec () {
        Scanner scr = new Scanner(System.in);
        System.out.println("Секунда:");
        int h = scr.nextInt();
        if(h < 0 || h > 59) {
            h = 0;
        }
        return h;
    }


}
