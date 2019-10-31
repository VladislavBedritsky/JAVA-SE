package modul_4.aggregationAndComposition.task_2.logic;

import modul_4.aggregationAndComposition.task_2.entity.Car;

import java.util.Scanner;

public class CarLogic {
    public void startToDrive (Car car) {

        Scanner scr = new Scanner(System.in);

        System.out.println("Какая модель у вашей машины?");
        car.printModel();
        System.out.println("|");

        System.out.println("Перед началом поездки проверьте состояние автомобиля. Начнем с колес.");
        for (int i = 0; i < 4; i ++) {
            System.out.println(car.getOurWh()+" "+(i+1)+" проверяется..");
        }
        System.out.println("Есть ли дефекты у колес? (Yes/No)");
        int q = 0;
        do {
            String s = scr.nextLine();
            if (s.equalsIgnoreCase("yes")) {
                System.out.println("|\n|\n|");
                car.changeWheels();
                q++;
            } else if (s.equalsIgnoreCase("no")) {
                q++;
            }
            if (q == 0) {
                System.out.println("Yes/No");
            }
        }while (q == 0);

        System.out.println("Давайте проверим уровень бензина.");
        System.out.println("|");
        System.out.println("Есть ли топливо в баке? (Yes/No)");
        int k = 0;
        do {
            String s = scr.nextLine();
            if (s.equalsIgnoreCase("yes")) {
                System.out.println("Запускаем "+car.getOurEng());
                k++;
            } else if (s.equalsIgnoreCase("no")) {
                System.out.println("|\n|\n|");
                car.checkFuel();
                System.out.println("Запускаем "+car.getOurEng());
                k++;
            }
            if (k == 0) {
                System.out.println("Yes/No");
            }
        }while (k == 0);

        System.out.println("|");
        System.out.println("Машина в полном порядке. Вы готовы ехать?(Yes/No)");
        int j = 0;
        do {
            String s = scr.nextLine();
            if (s.equalsIgnoreCase("yes")) {
                car.run();
                j++;
            } else if (s.equalsIgnoreCase("no")) {
                System.out.println("|\n|\n|");
                System.out.println("Goodbye!");
                j++;
            }
            if (j == 0) {
                System.out.println("Yes/No");
            }
        }while (j == 0);
    }
}
