package modul_4.aggregationAndComposition.task_3.entity;

import java.util.Objects;

public class District {

    private City districtCity;

    public District (City districtCity, String distrName) {
        this.districtCity = districtCity;
    }

    public City getDistrictCity() {
        return districtCity;
    }
    public void setDistrictCity(City districtCity) {
        this.districtCity = districtCity;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        District district = (District) o;
        return districtCity.equals(district.districtCity);

    }
    @Override
    public int hashCode() {
        return Objects.hash(districtCity);
    }
    @Override
    public String toString() {
        return "District{" +
                "districtCity=" + districtCity +
                '}';
    }
}
