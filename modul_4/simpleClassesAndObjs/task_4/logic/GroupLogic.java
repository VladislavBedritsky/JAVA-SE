package modul_4.simpleClassesAndObjs.task_4.logic;

import modul_4.simpleClassesAndObjs.task_4.entity.Group;
import modul_4.simpleClassesAndObjs.task_4.entity.Train;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GroupLogic {
    private CompareTrainByNumber compNumber;
    private CompareTrainByDestAndTime compDestAndTime;

    public GroupLogic(CompareTrainByNumber compTr) {
        this.compNumber = compTr;
    }
    public GroupLogic(CompareTrainByDestAndTime compDestAndTime) {
        this.compDestAndTime = compDestAndTime;
    }
    public GroupLogic() {
    }

    public List<Train> sortByNumb (Group group) {
        List<Train> trains = group.getTrains();
        trains.sort(compNumber);
        return new ArrayList<>(trains);
    }

    public List<Train> sortByDestAndTime (Group group) {
        List<Train> trains = group.getTrains();
        trains.sort(compDestAndTime);
        return new ArrayList<>(trains);
    }

    public List<Train> takeNumberOfTrain (Group group) {

        List<Train> result = new ArrayList<>();
        List<Train> trains = group.getTrains();

        Scanner scr = new Scanner(System.in);
        int k;
        int r = 0;
        do {
            System.out.println("Введите номер поезда: ");
            k = scr.nextInt();
            for (Train temp : trains) {
                if (temp.getNumber() == k) {
                    result.add(temp);
                    r++;
                }
            }
            if (r == 0) {
                System.out.println("Поезда с таким номером не существует, попробуйте ещё раз !");
            }
        }while (r == 0);
        return result;
    }

}