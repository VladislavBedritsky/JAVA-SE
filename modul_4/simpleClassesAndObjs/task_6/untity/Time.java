package modul_4.simpleClassesAndObjs.task_6.untity;
/*
6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
заданное количество часов, минут и секунд.
 */

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time (int hour,int minute,int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
    public int getHour() {
        return hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }
    public int getMinute() {
        return minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public int getSecond() {
        return second;
    }

    @Override
    public boolean equals (Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass())  return false;
        Time other = (Time) obj;
        return hour == other.hour &&
                minute == other.minute &&
                second == other.second;
    }
    @Override
    public int hashCode () {
        int result = 1;
        result = 31*result + hour;
        result = 31*result + minute;
        result = 31*result + second;
        return result;
    }
    @Override
    public String toString() {
        return "Time{" + hour + "h:" + minute + "m:" + second + "s}";
    }
}
