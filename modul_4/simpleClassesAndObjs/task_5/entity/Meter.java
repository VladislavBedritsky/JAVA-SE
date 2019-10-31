package modul_4.simpleClassesAndObjs.task_5.entity;

/*
5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
 */
public class Meter {

    private int value;

    public Meter(int value) {
        this.value = value;
    }

    public void setValue (int value) {
        this.value = value;
    }

    public int getValue () {
        return value;
    }

    @Override
    public boolean equals (Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Meter other = (Meter) obj;
        return value == other.value;
    }
    @Override
    public int hashCode () {
        int result = 1;
        result = 31*result + value;
        return result;
    }
    @Override
    public String toString() {
        return "Meter{ value=" + value + '}';
    }
}
