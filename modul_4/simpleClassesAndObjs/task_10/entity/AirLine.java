package modul_4.simpleClassesAndObjs.task_10.entity;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;
/*
10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного
 */
public class AirLine {

    private String destination;
    private int number;
    private String type;
    private Date time;
    private String[] day;

    public static SimpleDateFormat sTime = new SimpleDateFormat("HH:mm");

    public AirLine (String destination,int number, String type, Date time, String[] day) {
        this.destination = destination;
        this.number = number;
        this.type = type;
        this.time = time;
        this.day = day;
    }

    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Date getTime() {
        return time;
    }
    public void setTime(Date time) {
        this.time = time;
    }
    public String[] getDay() {
        return day;
    }
    public void setDay(String[] day) {
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AirLine other = (AirLine) o;
        return number == other.number &&
                destination.equals(other.destination) &&
                type.equals(other.type) &&
                time.equals(other.time) &&
                Arrays.equals(day,other.day);
    }
    @Override
    public int hashCode() {
        return Objects.hash(destination, number, type, time, day);
    }

    @Override
    public String toString() {
        return "AirLine{ destination=" + destination + '\'' + ", number=" + number + ", type=" + type + '\'' + ", time=" + sTime.format(time) + ", day=" + Arrays.toString(day) + '}';
    }
}
