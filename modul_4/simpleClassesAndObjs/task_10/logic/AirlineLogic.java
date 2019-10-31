package modul_4.simpleClassesAndObjs.task_10.logic;

import modul_4.simpleClassesAndObjs.task_10.entity.AirLine;
import modul_4.simpleClassesAndObjs.task_10.entity.Info;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class AirlineLogic {

    public List<AirLine> outputByDest (Info info) {
        List<AirLine> result = new ArrayList<>();
        List<AirLine> x = info.getAirLines();
        int q = 0;
        String k;
        Scanner scr = new Scanner(System.in);
        System.out.println("Куда хотите полететь?");
        do {
            k = scr.nextLine();
            for (AirLine temp : x) {
                if (k.equalsIgnoreCase(temp.getDestination())){
                    result.add(temp);
                    q++;
                }
            }
            if(q == 0) {
                System.out.println("try again");
            }
        }while (q == 0);
        return result;
    }

    public List<AirLine> outputByDay (Info info) {
        List<AirLine> result = new ArrayList<>();
        List<AirLine> x = info.getAirLines();
        int q = 0;
        String k;
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите день:");
        do {
            k = scr.nextLine();
            for (AirLine temp : x) {
                for (int i = 0; i < temp.getDay().length; i++) {
                    if (k.equalsIgnoreCase(temp.getDay()[i])) {
                        result.add(temp);
                        q++;
                    }
                }
            }
            if(q == 0) {
                System.out.println("try again");
            }
        }while (q == 0);
        return result;
    }

    public List<AirLine> outputByTime (Info info) {

        List<AirLine> result = new ArrayList<>();
        List<AirLine> x = info.getAirLines();
        int q = 0;
        String k,k1;
        Scanner scr = new Scanner(System.in);
        do {
            try {
                System.out.println("Введите день недели:");
                k1 = scr.nextLine();
                System.out.println("Введите время(HH:mm), после которого вам удобно вылететь:");
                k = scr.nextLine();
                SimpleDateFormat d = new SimpleDateFormat("HH:mm");
                Date date = d.parse(k);
                for (AirLine temp : x) {
                    for (int i = 0; i < temp.getDay().length; i++) {
                        if (temp.getTime().compareTo(date) >= 0 && k1.equalsIgnoreCase(temp.getDay()[i])) {
                            result.add(temp);
                            q++;
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("Неправильно заданный формат времени(HH:mm) или дня недели");
            }
            if(q == 0) {
                System.out.println("Подходящих вылетов не найдено");
            }
        }while (q == 0);
        return result;
    }
}
