package modul_4.aggregationAndComposition.task_3.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Region {

    private String regionName;
    private City regionCenter;
    private double square;
    private List<District> districts;

    public Region (String regionName, City regionCenter, double square) {
        this.regionName = regionName;
        this.regionCenter = regionCenter;
        this.square = square;
        districts = new ArrayList<>();
    }

    public void add (District temp) {
        districts.add(temp);
    }

    public String getRegionName() {
        return regionName;
    }
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public City getRegionCenter() {
        return regionCenter;
    }
    public void setRegionCenter(City regionCenter) {
        this.regionCenter = regionCenter;
    }

    public double getSquare() {
        return square;
    }
    public void setSquare(double square) {
        this.square = square;
    }

    public List<District> getDistricts() {
        return districts;
    }
    public void setDistricts(List<District> districts) {
        this.districts = districts;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region = (Region) o;
        return Double.compare(region.square, square) == 0 &&
                regionName.equals(region.regionName) &&
                regionCenter.equals(region.regionCenter) &&
                districts.equals(region.districts);
    }
    @Override
    public int hashCode() {
        return Objects.hash(regionName, regionCenter, square, districts);
    }
    @Override
    public String toString() {
        return "Region{" +
                "regionName='" + regionName + '\'' +
                ", regionCenter=" + regionCenter +
                ", square=" + square +
                ", districts=" + districts +
                '}';
    }
}
