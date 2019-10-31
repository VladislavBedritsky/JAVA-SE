package modul_4.simpleClassesAndObjs.task_4.main;

import modul_4.simpleClassesAndObjs.task_4.entity.Group;
import modul_4.simpleClassesAndObjs.task_4.entity.Train;
import modul_4.simpleClassesAndObjs.task_4.logic.CompareTrainByDestAndTime;
import modul_4.simpleClassesAndObjs.task_4.logic.CompareTrainByNumber;
import modul_4.simpleClassesAndObjs.task_4.logic.GroupLogic;
import static modul_4.simpleClassesAndObjs.task_4.print.Print.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Group table = new Group();

        table.add(new Train("to Brest",1403,"23:45"));
        table.add(new Train("to Grodno",113,"14:35"));
        table.add(new Train("to St.Petersburg",1205,"09:10"));
        table.add(new Train("to Moscow",354,"21:45"));
        table.add(new Train("to Brest",856,"18:30"));

        CompareTrainByNumber compNumber = new CompareTrainByNumber();             //по номерам
        GroupLogic groupLNumber = new GroupLogic(compNumber);
        List<Train> sortedByNumberOfTrain = groupLNumber.sortByNumb(table);
        System.out.println("Отсортированное расписание по номерам:");
        printByNumber(sortedByNumberOfTrain);
        System.out.println("__________________________________________");

        CompareTrainByDestAndTime compDest = new CompareTrainByDestAndTime();      // по пункту назначения и времени
        GroupLogic groupLDest = new GroupLogic(compDest);
        List<Train> sortedByDestOfTrain = groupLDest.sortByDestAndTime(table);
        System.out.println("Отсортированное расписание по пунктам назначения и времени отправления:");
        printByDest(sortedByDestOfTrain);
        System.out.println("__________________________________________");

        GroupLogic g = new GroupLogic();                                            // по номеру, введенного с консоли
        List<Train> ourNumberOfTrain = g.takeNumberOfTrain(table);
        System.out.println("Ваш поезд: ");
        printUserNumber(ourNumberOfTrain);

    }
}
