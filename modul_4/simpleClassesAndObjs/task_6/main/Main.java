package modul_4.simpleClassesAndObjs.task_6.main;

import modul_4.simpleClassesAndObjs.task_6.logic.ChangeTime;
import modul_4.simpleClassesAndObjs.task_6.untity.Time;
import modul_4.simpleClassesAndObjs.task_6.logic.TimeLogic;

public class Main {
    public static void main(String[] args) {

        TimeLogic timeLogic = new TimeLogic();
        Time t = new Time(timeLogic.ourHour(),timeLogic.ourMin(), timeLogic.ourSec());
        System.out.println(t);

        ChangeTime change = new ChangeTime();                                        //метод изменения времени
        change.time();

    }
}
