package modul_4.simpleClassesAndObjs.task_5.print;

import modul_4.simpleClassesAndObjs.task_5.entity.Meter;

import java.util.List;

public class Print {

    public static void printPrimordialValue (List<Meter> ourPrimordialValue) {
        for (Meter temp : ourPrimordialValue) {
            System.out.println("Окончательное значение счетчика = "+temp.getValue());
        }
    }
}
