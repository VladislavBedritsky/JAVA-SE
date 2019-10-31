package modul_4.aggregationAndComposition.task_2.main;

import modul_4.aggregationAndComposition.task_2.entity.Engine;
import modul_4.aggregationAndComposition.task_2.entity.Wheel;
import modul_4.aggregationAndComposition.task_2.entity.Car;
import modul_4.aggregationAndComposition.task_2.logic.CarLogic;

public class Main {

    public static void main(String[] args) {

        Wheel w = new Wheel("Колесо");
        Engine e = new Engine("Двигатель");
        Car c = new Car(w,e);
        CarLogic cl = new CarLogic();

        cl.startToDrive(c);

    }
}
