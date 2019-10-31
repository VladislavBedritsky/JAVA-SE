package modul_4.aggregationAndComposition.task_2.entity;

import java.util.Scanner;

public class Car {

    private Wheel ourWh;
    private Engine ourEng;

    public Car(Wheel ourWh, Engine ourEng) {
        this.ourWh = ourWh;
        this.ourEng = ourEng;
    }

    public void run () {
        System.out.println("Мы в пути!))");
    }
    public void changeWheels () {
        System.out.println("Проблема с колесами устранена. Все ок!");
    }
    public void checkFuel () {
        System.out.println("Машина заправлена!");
    }
    public void printModel (){
        Scanner scr = new Scanner(System.in);
        String s = scr.nextLine();
        System.out.println("Модель вашего авто - "+s);
    }

    public void setOurWh(Wheel ourWh) {
        this.ourWh = ourWh;
    }
    public void setOurEng(Engine ourEng) {
        this.ourEng = ourEng;
    }
    public Wheel getOurWh() {
        return ourWh;
    }
    public Engine getOurEng() {
        return ourEng;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car other = (Car) o;
        return ourWh.equals(other.ourWh) &&
                ourEng.equals(other.ourEng) ;
    }
    public int hashCode () {
        int result = 1;
        result = 31* result + (ourWh == null ? 0 : ourWh.hashCode());
        result = 31* result + (ourEng == null ? 0 : ourEng.hashCode());
        return result;
    }
    @Override
    public String toString() {
        return "Car{" +
                "ourWh=" + ourWh +
                ", ourEng=" + ourEng +
                '}';
    }
}
