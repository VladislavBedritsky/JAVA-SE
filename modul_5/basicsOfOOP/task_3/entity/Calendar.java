package modul_5.basicsOfOOP.task_3.entity;

import java.util.GregorianCalendar;
import java.util.Objects;

public class Calendar {

    public static int year = 2019;

    private Holiday holiday;
    private GregorianCalendar gregorianCalendar;

    public Calendar(Holiday holiday, GregorianCalendar gregorianCalendar) {
        this.gregorianCalendar = gregorianCalendar;
        this.holiday = holiday;
    }

    public Holiday getHoliday() {
        return holiday;
    }

    public void setHoliday(Holiday holiday) {
        this.holiday = holiday;
    }

    public GregorianCalendar getGregorianCalendar() {
        return gregorianCalendar;
    }

    public void setGregorianCalendar(GregorianCalendar gregorianCalendar) {
        this.gregorianCalendar = gregorianCalendar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calendar calendar = (Calendar) o;
        return holiday == calendar.holiday &&
                gregorianCalendar.equals(calendar.gregorianCalendar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(holiday, gregorianCalendar);
    }

    @Override
    public String toString() {
        return "Holiday{" +
                "typeOfHolidays=" + holiday +
                ", date=" + gregorianCalendar +
                '}';
    }
}
