package modul_4.simpleClassesAndObjs.task_4.entity;
/*
4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
назначения должны быть упорядочены по времени отправления.
 */
public class Train {

    private String nameOfDest;
    private int number;
    private String time;

    public Train(String nameOfDest, int number, String time) {
        this.nameOfDest = nameOfDest;
        this.number = number;
        this.time = time;
    }

    public String getTime () {
        return time;
    }

    public int getNumber() {
        return number;
    }

    public String getNameOfDest() {
        return nameOfDest;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setNameOfDest(String nameOfDest) {
        this.nameOfDest = nameOfDest;
    }

    @Override
    public boolean equals (Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Train other = (Train) obj;
        return number == other.number &&
                time.equals(other.time) &&
                nameOfDest.equals(other.nameOfDest);
    }
    @Override
    public int hashCode() {
        int result =1;
        result = 31*result + number;
        result = 31*result + (nameOfDest == null ? 0 : nameOfDest.hashCode());
        result =31*result + (time == null ? 0 : time.hashCode());
        return result;
    }
    @Override
    public String toString() {
        return "Train { destination: "+nameOfDest+"; number: "+number+"; time: "+time+" }";
    }
}
