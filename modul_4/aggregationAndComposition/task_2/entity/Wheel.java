package modul_4.aggregationAndComposition.task_2.entity;
/*
2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
менять колесо, вывести на консоль марку автомобиля.
 */
public class Wheel {

    private String koleso;

    public Wheel (String koleso) {
        this.koleso = koleso;
    }

    public void setKoleso (String koleso) {
        this.koleso = koleso;
    }
    public String getKoleso() {
        return koleso;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheel wheel = (Wheel) o;
        return koleso.equals(wheel.koleso);
    }
    @Override
    public int hashCode() {
        int result = 1;
        return 31*result + (koleso == null ? 0 : koleso.hashCode());
    }

    @Override
    public String toString() {
        return koleso;
    }
}
