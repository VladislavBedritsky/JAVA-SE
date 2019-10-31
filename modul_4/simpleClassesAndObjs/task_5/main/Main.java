package modul_4.simpleClassesAndObjs.task_5.main;

import modul_4.simpleClassesAndObjs.task_5.entity.IndicationOfMeter;
import modul_4.simpleClassesAndObjs.task_5.entity.Meter;
import modul_4.simpleClassesAndObjs.task_5.logic.PrimodrialValue;
import modul_4.simpleClassesAndObjs.task_5.logic.MinusValue;
import modul_4.simpleClassesAndObjs.task_5.logic.PlusValue;
import static modul_4.simpleClassesAndObjs.task_5.print.Print.printPrimordialValue;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        IndicationOfMeter indM = new IndicationOfMeter();

        indM.add(new Meter(0));
        indM.add(new Meter(1));
        indM.add(new Meter(2));
        indM.add(new Meter(3));
        indM.add(new Meter(4));
        indM.add(new Meter(5));
        indM.add(new Meter(6));
        indM.add(new Meter(7));
        indM.add(new Meter(8));
        indM.add(new Meter(9));
        indM.add(new Meter(10));

        PrimodrialValue prValue = new PrimodrialValue();                           // Изначальное значение
        List<Meter> ourPrimordialValue = prValue.ourValue(indM);
        printPrimordialValue(ourPrimordialValue);

        PlusValue pv = new PlusValue();                                        // Метод Плюс
        System.out.println("_____________________");
        pv.plus(ourPrimordialValue);

        MinusValue mv = new MinusValue();                                      // Метод минус
        System.out.println("_____________________");
        mv.minus(ourPrimordialValue);

    }
}
