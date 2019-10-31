package modul_4.aggregationAndComposition.task_3.entity;

import java.util.Objects;
/*
3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
        столицу, количество областей, площадь, областные центры.
 */
public class City {

    private String name;

    public City(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return name.equals(city.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
    @Override
    public String toString() {
        return name;
    }
}
