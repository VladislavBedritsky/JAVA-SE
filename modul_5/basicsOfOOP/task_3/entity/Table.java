package modul_5.basicsOfOOP.task_3.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Table {

    private List<Calendar> holidays;

    public Table() {
        holidays = new ArrayList<>();
    }

    public void add (Calendar temp) {
        holidays.add(temp);
    }

    public List<Calendar> getHolidays() {
        return holidays;
    }

    public void setHolidays(List<Calendar> calendars) {
        this.holidays = calendars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Table that = (Table) o;
        return holidays.equals(that.holidays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(holidays);
    }

    @Override
    public String toString() {
        return "InfoHolidays{" +
                "holidays=" + holidays +
                '}';
    }
}
