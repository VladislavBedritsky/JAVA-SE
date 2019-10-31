package modul_4.simpleClassesAndObjs.task_4.logic;

import modul_4.simpleClassesAndObjs.task_4.entity.Train;

import java.util.Comparator;

public class CompareTrainByNumber implements Comparator<Train> {
    @Override
    public int compare(Train o1,Train o2) {
        int result;
        result = Integer.compare(o1.getNumber(),o2.getNumber());
        if (result != 0) {
            return result;
        }
        return result;
    }
}
