package modul_4.aggregationAndComposition.task_5.Logic;

import modul_4.aggregationAndComposition.task_5.entity.TourOperator;
import modul_4.aggregationAndComposition.task_5.entity.TourPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TourOperatorLogic {

    public List<TourPackage> sortByTr (TourOperator tourOperator) {

        List<TourPackage> x = tourOperator.getPackages();
        List<TourPackage> result = new ArrayList<>();

        String transport,food;
        int days;

        int q = 0;
        Scanner scr = new Scanner(System.in);
        do {
            System.out.println("Введите интересующий вас транспорт для путешествия:");
            transport = scr.nextLine();
            for (TourPackage temp : x ) {
                if (transport.equalsIgnoreCase(temp.getTransport())) {
                    q++;
                    result.add(temp);
                }
            }
            if(q == 0) {
                System.out.println("Такого транспорта нет. Попробуйте еще раз.");
            }
        }while ( q == 0);

        System.out.println("_____________");
        for (TourPackage temp : result) {
            System.out.println(temp);
        }
        System.out.println("_____________");

        int q1 = 0;
        List<TourPackage> result1 = new ArrayList<>();
        do {
            System.out.println("Введите интересующий вас тип питания:");
            food = scr.nextLine();
            for (TourPackage temp : result ) {
                if (food.equalsIgnoreCase(temp.getFood())) {
                    q1++;
                    result1.add(temp);
                }
            }
            if(q1 == 0) {
                System.out.println("Такого типа питания нет. Попробуйте еще раз.");
            }
        }while ( q1 == 0);

        System.out.println("_____________");
        for (TourPackage temp : result1) {
            System.out.println(temp);
        }
        System.out.println("_____________");

        List<TourPackage> result2 = new ArrayList<>();
        System.out.println("На какой срок вы планируете уехать?");
        days = scr.nextInt();
        for (TourPackage temp : result1 ) {
            if (days <= temp.getTime()) {
                result2.add(temp);
            }
        }

        List<TourPackage> resultX = new ArrayList<>();
        if (result2.size() != 0) {
            System.out.println("Интересующие вас путевки:");
            System.out.println("_____________");
            for (TourPackage temp : result2) {
                System.out.println(temp);
            }
            int z = 0;
            int number;
            System.out.println("_____________");
            System.out.println("Какая из этих путевок вас интересует?(введите число)");
            do {
                number = scr.nextInt();
                for (int i = 0; i < result2.size();i++) {
                    if (number == i + 1) {
                        resultX.add(result2.get(i));
                        z++;
                    }
                }
                if (z == 0) {
                    System.out.println("Try again");
                }
            }while (z == 0);

        }
        return resultX;
    }
}
