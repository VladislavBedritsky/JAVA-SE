package modul_5.basicsOfOOP.task_3.main;

import modul_5.basicsOfOOP.task_3.entity.Calendar;
import modul_5.basicsOfOOP.task_3.entity.Holiday;
import modul_5.basicsOfOOP.task_3.entity.Table;
import modul_5.basicsOfOOP.task_3.logic.CalendarLogic;

import java.util.GregorianCalendar;

public class Main {
/*
Задача 3.
Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о
выходных и праздничных днях.
 */
    public static void main(String[] args) {

        Table tableHolidays = new Table();

        tableHolidays.add(new Calendar(Holiday.NEW_YEAR,new GregorianCalendar(Calendar.year,GregorianCalendar.JANUARY,1)));
        tableHolidays.add(new Calendar(Holiday.CHRISTMAS_ORTHODOX,new GregorianCalendar(Calendar.year,GregorianCalendar.JANUARY,7)));
        tableHolidays.add(new Calendar(Holiday.WOMEN_DAY,new GregorianCalendar(Calendar.year,GregorianCalendar.MARCH,8)));
        tableHolidays.add(new Calendar(Holiday.LABOR_DAY,new GregorianCalendar(Calendar.year,GregorianCalendar.MAY,1)));
        tableHolidays.add(new Calendar(Holiday.VICTORY_DAY,new GregorianCalendar(Calendar.year,GregorianCalendar.MAY,5)));
        tableHolidays.add(new Calendar(Holiday.INDEPENDENCE_DAY,new GregorianCalendar(Calendar.year,GregorianCalendar.JULY,3)));
        tableHolidays.add(new Calendar(Holiday.OCT_REVOLUTION,new GregorianCalendar(Calendar.year,GregorianCalendar.NOVEMBER,11)));
        tableHolidays.add(new Calendar(Holiday.CHRISTMAS_CATHOLIC,new GregorianCalendar(Calendar.year,GregorianCalendar.DECEMBER,12)));

        CalendarLogic calendarLogic = new CalendarLogic();
        calendarLogic.ourCalendar(tableHolidays);

    }
}
