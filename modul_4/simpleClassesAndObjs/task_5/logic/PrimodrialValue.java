package modul_4.simpleClassesAndObjs.task_5.logic;

import modul_4.simpleClassesAndObjs.task_5.entity.IndicationOfMeter;
import modul_4.simpleClassesAndObjs.task_5.entity.Meter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimodrialValue {

    public List<Meter> ourValue (IndicationOfMeter indicationOfMeter) {

        Scanner scr = new Scanner(System.in);
        String s;
        int q = 0;
        do {
            System.out.println("Значение счетчика по умолчанию равно 5, если хотите оставить - введите yes, если нет - no");
            s = scr.nextLine();
            if(s.equalsIgnoreCase("yes")) {
                s = "yes";
                q++;
            }else if (s.equalsIgnoreCase("no")) {
                s = "no";
                q++;
            }
        }while (q == 0);

        List<Meter> result = new ArrayList<>();
        List<Meter> indications = indicationOfMeter.getSegmentation();

        if(s.equalsIgnoreCase("yes")) {
            for (Meter temp : indications) {
                if (temp.getValue() == 5) {
                    result.add(temp);
                }
            }
        }else {
            int k;
            int r = 0;
            do {
                System.out.println("Введите ваше значение счетчика: ");
                k = scr.nextInt();
                for (Meter temp : indications) {
                    if (temp.getValue() == k) {
                        result.add(temp);
                        r++;
                    }
                }
                if (r == 0) {
                    System.out.println("Такого значения счетчика не существует !");
                }
            }while (r == 0);
        }
        return result;
    }
}
