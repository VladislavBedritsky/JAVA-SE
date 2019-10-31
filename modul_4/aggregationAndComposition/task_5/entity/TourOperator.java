package modul_4.aggregationAndComposition.task_5.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TourOperator {

    private String name;
    private List <TourPackage> packages;

    public TourOperator (String name) {
        this.name = name;
        packages = new ArrayList<>();
    }

    public void add (TourPackage temp) {
        packages.add(temp);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TourPackage> getPackages() {
        return packages;
    }

    public void setPackages(List<TourPackage> packages) {
        this.packages = packages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TourOperator that = (TourOperator) o;
        return name.equals(that.name) &&
                packages.equals(that.packages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, packages);
    }

    @Override
    public String toString() {
        return "TourOperator{" +
                "name='" + name + '\'' +
                ", packages=" + packages +
                '}';
    }
}
