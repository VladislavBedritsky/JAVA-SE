package modul_4.simpleClassesAndObjs.task_10.entity;

import java.util.ArrayList;
import java.util.List;

public class Info {

    private List<AirLine> airLines;

    public Info () {
        airLines = new ArrayList<>();
    }

    public void add (AirLine newAirLine) {
        airLines.add(newAirLine);
    }

    public void setAirLines (List<AirLine> airLines) {
        this.airLines = airLines;
    }
    public List<AirLine> getAirLines () {
        return airLines;
    }
    @Override
    public boolean equals (Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Info other = (Info) obj;
        return airLines.equals(other.airLines);
    }
    @Override
    public int hashCode () {
        int result = 1;
        for (AirLine temp : airLines) {
            result = 31*result + (temp == null ? 0 : temp.hashCode());
        }
        return result;
    }
    @Override
    public String toString() {
        return "Info{ airLines=" + airLines + '}';
    }
}
