package modul_4.simpleClassesAndObjs.task_4.logic;

import modul_4.simpleClassesAndObjs.task_4.entity.Train;

import java.util.Comparator;

public class CompareTrainByDestAndTime implements Comparator<Train> {
    @Override
    public int compare(Train o1, Train o2) {
        int result;
        result = o1.getNameOfDest().compareTo(o2.getNameOfDest());
        if(result != 0) {
            return result;
        }
        result = o1.getTime().compareTo(o2.getTime());
        if(result != 0) {
            return result;
        }
        return result;
    }
}
