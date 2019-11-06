package modul_5.basicsOfOOP.task_4.entity;

import java.util.Objects;

public class Treasure {

    private String name;
    private int value;
    private int id;

    public Treasure(int id,String name,int value) {
        this.name = name;
        this.value = value;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Treasure treasure = (Treasure) o;
        return value == treasure.value &&
                name.equals(treasure.name) &&
                id == treasure.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value, id);
    }

    @Override
    public String toString() {
        return "Treasure{" +id+
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
