package modul_5.basicsOfOOP.task_4.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class KitOfTreasure {

    private List<Treasure> treasures;

    public KitOfTreasure () {
        treasures = new ArrayList<>();
    }

    public void add (Treasure treasure) {
        treasures.add(treasure);
    }

    public List<Treasure> getTreasures() {
        return treasures;
    }

    public void setTreasures(List<Treasure> treasures) {
        this.treasures = treasures;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KitOfTreasure that = (KitOfTreasure) o;
        return treasures.equals(that.treasures);
    }

    @Override
    public int hashCode() {
        return Objects.hash(treasures);
    }

    @Override
    public String toString() {
        return "KitOfTreasure{" +
                "treasures=" + treasures +
                '}';
    }
}
