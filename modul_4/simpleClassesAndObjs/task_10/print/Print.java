package modul_4.simpleClassesAndObjs.task_10.print;

import modul_4.simpleClassesAndObjs.task_10.entity.AirLine;

import java.util.List;

public class Print {

    public static void printByDest (List<AirLine> destination) {
        for (AirLine temp : destination) {
            System.out.println(temp);
        }
    }

    public static void printByDay (List<AirLine> day) {
        for (AirLine temp : day) {
            System.out.println(temp);
        }
    }

    public static void printByTime (List<AirLine> time) {
        for (AirLine temp : time) {
            System.out.println(temp);
        }
    }
}
