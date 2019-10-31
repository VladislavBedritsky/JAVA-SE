package modul_4.aggregationAndComposition.task_5.entity;

import java.util.Objects;

public class TourPackage {
    /*
    5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
    различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
    возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
*/

    private String place;
    private String type;
    private String transport;
    private String food;
    private int time;

    public TourPackage (String place, String type, String transport, String food, int time) {
        this.place = place;
        this.type = type;
        this.transport = transport;
        this.food = food;
        this.time = time;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TourPackage that = (TourPackage) o;
        return time == that.time &&
                place.equals(that.place) &&
                type.equals(that.type) &&
                transport.equals(that.transport) &&
                food.equals(that.food);
    }
    @Override
    public int hashCode() {
        return Objects.hash(place, type, transport, food, time);
    }
    @Override
    public String toString() {
        return "TourPackage{" +
                "place='" + place + '\'' +
                ", type='" + type + '\'' +
                ", transport='" + transport + '\'' +
                ", food='" + food + '\'' +
                ", time=" + time +
                '}';
    }
}
