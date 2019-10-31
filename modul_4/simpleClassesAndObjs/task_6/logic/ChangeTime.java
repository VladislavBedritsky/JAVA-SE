package modul_4.simpleClassesAndObjs.task_6.logic;

import modul_4.simpleClassesAndObjs.task_6.untity.Time;

import java.util.Scanner;

public class ChangeTime {

    public void time () {
        System.out.println("Хотите поменять время? (Yes/No)");
        Scanner scr = new Scanner(System.in);
        String s;
        int q = 0;
        do {
            s = scr.nextLine();
            if(s.equalsIgnoreCase("yes")) {
                q++;
            }else if(s.equalsIgnoreCase("no")) {
                q++;
            }else System.out.println("Yes/No");
        }while (q == 0);

        if (s.equalsIgnoreCase("yes")) {
            TimeLogic timeLogic = new TimeLogic();
            Time t = new Time(timeLogic.ourHour(),timeLogic.ourMin(), timeLogic.ourSec());
            System.out.println(t);
        }
    }
}
