package modul_4.simpleClassesAndObjs.task_4.print;

import modul_4.simpleClassesAndObjs.task_4.entity.Train;

import java.util.List;

public class Print {

    public static void printByNumber (List<Train> sortedByNumberOfTrain) {
        for (Train temp : sortedByNumberOfTrain) {
            System.out.println("Направление: "+temp.getNameOfDest()+"; номер поезда: "+temp.getNumber()+"; время отправления: "+temp.getTime());
        }
    }

    public static void printByDest (List<Train> sortedByDestOfTrain) {
        for (Train temp : sortedByDestOfTrain) {
            System.out.println("Направление: "+temp.getNameOfDest()+"; номер поезда: "+temp.getNumber()+"; время отправления: "+temp.getTime());
        }
    }

    public static void printUserNumber (List<Train> ourNumberOfTrain) {
        for (Train temp : ourNumberOfTrain) {
            System.out.println("Направление: "+temp.getNameOfDest()+"; номер поезда: "+temp.getNumber()+"; время отправления: "+temp.getTime());
        }
    }
}
