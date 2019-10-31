package modul_4.aggregationAndComposition.task_3.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Country {

    private String countryName;
    private City capital;
    private List<Region> regions;

    public Country(String countryName,City capital) {
        this.countryName = countryName;
        this.capital = capital;
        regions = new ArrayList<>();
    }

    public void add (Region temp) {
        regions.add(temp);
    }

    public void printCapital () {
        System.out.println("Столица: "+capital);
    }

    public void printAmountOfRegions () {
        System.out.println("Количество областей: "+regions.size());
    }

    public void printSquare () {
        double s = 0;
        for (Region temp : regions) {
            s += temp.getSquare();
        }
        System.out.println("Площадь страны: "+s);
    }

    public void printCities () {
        System.out.println("Областные центры: ");
        for (Region temp : regions) {
            System.out.printf("%s;",temp.getRegionCenter());
        }
    }

    public String getCountryName() {
        return countryName;
    }
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public City getCapital() {
        return capital;
    }
    public void setCapital(City capital) {
        this.capital = capital;
    }

    public List<Region> getRegions() {
        return regions;
    }
    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return countryName.equals(country.countryName) &&
                capital.equals(country.capital) &&
                regions.equals(country.regions);
    }
    @Override
    public int hashCode() {
        return Objects.hash(countryName, capital, regions);
    }
    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", capital=" + capital +
                ", regions=" + regions +
                '}';
    }
}
