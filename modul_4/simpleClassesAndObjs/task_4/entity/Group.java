package modul_4.simpleClassesAndObjs.task_4.entity;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private List<Train> trains;

    public Group() {
        trains = new ArrayList<Train>();
    }
    public void add (Train newTrain) {
        trains.add(newTrain);
    }
    public void setTrains (List<Train>trains) {
        this.trains = trains;
    }
    public List<Train> getTrains() {
        return trains;
    }
    @Override
    public boolean equals (Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Group other = (Group) obj;
        return trains.equals(other.trains);
    }
    @Override
    public int hashCode () {
        int result = 1;
        for (Train temp : trains) {
            result = 31*result + (trains == null ? 0 : trains.hashCode());
        }
        return result;
    }
    @Override
    public String toString() {
        return "Info{ trains= " + trains + '}';
    }
}
