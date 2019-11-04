package modul_5.basicsOfOOP.task_3.logic;

import modul_5.basicsOfOOP.task_3.entity.Table;

import java.text.SimpleDateFormat;
import java.util.*;
import static java.util.Calendar.*;

public class CalendarLogic {

    public void ourCalendar (Table table)  {

        Scanner scr = new Scanner(System.in);
        System.out.println("Введите номер месяца:");
        int month;
        int q = 0;
        do {
            month = scr.nextInt();
            if (month >= 1 && month <= 12) {
                q++;
                month -= 1;
            }
            if (q == 0) {
                System.out.println("В календаре 12 месяцев.");
            }
        }while (q == 0);
        q = 0;

        List<modul_5.basicsOfOOP.task_3.entity.Calendar> ourHolidays = table.getHolidays();

        SimpleDateFormat a = new SimpleDateFormat("dd:MM:yyyy - EEEE");
        SimpleDateFormat a1 = new SimpleDateFormat("dd:MM:yyyy");

        GregorianCalendar startDate = new GregorianCalendar();
        startDate.set(MONTH,month);
        startDate.set(YEAR, modul_5.basicsOfOOP.task_3.entity.Calendar.year);
        startDate.set(DAY_OF_MONTH,1);

        GregorianCalendar endDate = new GregorianCalendar();
        endDate.set(MONTH,month+1);
        endDate.set(YEAR, modul_5.basicsOfOOP.task_3.entity.Calendar.year);
        endDate.set(DAY_OF_MONTH,1);

        // Поиск праздников
        System.out.println("Даты праздников в заданном месяце:");

       for (modul_5.basicsOfOOP.task_3.entity.Calendar temp : ourHolidays) {
           if (temp.getGregorianCalendar().get(MONTH) == startDate.get(MONTH) ) {
               System.out.println(a1.format(temp.getGregorianCalendar().getTime())+" - "+temp.getHoliday());
               q++;
           }
       }
       if (q == 0) {
           System.out.println("Праздников в этом месяце нету.");
       }
        System.out.println("_____________________");

        // поиск выходных
        System.out.println("Даты выходных в этом месяце:");
        while (startDate.before(endDate)) {

            if(startDate.get(DAY_OF_WEEK) == SUNDAY || startDate.get(DAY_OF_WEEK) == SATURDAY) {
                System.out.println(a.format(startDate.getTime()));
            }
            startDate.add(DAY_OF_MONTH,1);
        }
    }
}
