package modul_4.simpleClassesAndObjs.task_5.logic;

import modul_4.simpleClassesAndObjs.task_5.entity.Meter;

import java.util.List;
import java.util.Scanner;

public class MinusValue {

    public void minus (List<Meter> ourPrimordialValue) {
        int k = 0;
        int s;
        Scanner scr = new Scanner(System.in);

        for (Meter temp : ourPrimordialValue) {
            k = temp.getValue();
            do {
                System.out.println("До какого значения уменьшить счетчик:");
                s = scr.nextInt();
                if (k <= s || s < 0) {
                    System.out.println("Недопустимое значение(ваше число должно быть меньше текущего значения и быть больше 0) !");
                }
            }while (k <= s || s < 0);
            do {
                k--;
                System.out.println(k);
            }while (k != s );
        }

        String r;
        int q = 0;
        System.out.println("Хотите вернуть до значения по умолчанию? (Yes/No)");
        do {
            r = scr.nextLine();
            if(r.equalsIgnoreCase("yes")) {
                r = "yes";
                q++;
            }else if (r.equalsIgnoreCase("no")) {
                r = "no";
                q++;
            }
            if(q == 0) {
                System.out.println("Yes/No:");
            }
        }while (q == 0);

        if(r.equalsIgnoreCase("yes")) {
            for (Meter temp : ourPrimordialValue) {
                do {
                    k++;
                    System.out.println(k);
                }while (k != temp.getValue());
            }
        }
    }
}
