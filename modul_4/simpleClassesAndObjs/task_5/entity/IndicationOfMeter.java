package modul_4.simpleClassesAndObjs.task_5.entity;

import java.util.ArrayList;
import java.util.List;

public class IndicationOfMeter {

    private List<Meter> segmentation;

    public IndicationOfMeter () {
        segmentation = new ArrayList<>();
    }

    public void add (Meter value) {
        segmentation.add(value);
    }

    public void setSegmentation(List<Meter> segmentation) {
        this.segmentation = segmentation;
    }

    public List<Meter> getSegmentation() {
        return segmentation;
    }

    @Override
    public boolean equals (Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        IndicationOfMeter other = (IndicationOfMeter) obj;
        return segmentation.equals(other.segmentation);
    }
    @Override
    public int hashCode () {
        int result = 1;
        for (Meter temp : segmentation) {
            result = 31*result + (segmentation == null ? 0 : segmentation.hashCode());
        }
        return result;
    }
    @Override
    public String toString() {
        return "IndicationOfMeter{ segmentation=" + segmentation + '}';
    }
}
