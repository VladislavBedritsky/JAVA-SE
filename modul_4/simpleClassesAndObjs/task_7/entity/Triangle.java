package modul_4.simpleClassesAndObjs.task_7.entity;
/*
Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
площади, периметра и точки пересечения медиан.
 */
import java.util.Arrays;

public class Triangle {

    private double[] pointA;
    private double[] pointB;
    private double[] pointC;

    public Triangle(double[] pointA, double[] pointB, double[] pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public void setPointA (double[] pointA) {
        this.pointA = pointA;
    }
    public void setPointB (double[] pointB) {
        this.pointB = pointB;
    }
    public void setPointC(double[] pointC) {
        this.pointC = pointC;
    }

    public double[] getPointA() {
        return pointA;
    }
    public double[] getPointB() {
        return pointB;
    }
    public double[] getPointC() {
        return pointC;
    }
    @Override
    public boolean equals (Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Triangle other = (Triangle) obj;
        return Arrays.equals(pointA,other.pointA) &&
                Arrays.equals(pointB,other.pointB) &&
                Arrays.equals(pointC,other.pointC);
    }
    @Override
    public int hashCode () {
        double result = 1;
        for(double temp : pointA) {
            result = 31*result + temp;
        }
        for(double temp : pointB) {
            result = 31*result + temp;
        }
        for(double temp : pointC) {
            result = 31*result + temp;
        }
        return (int) result;
    }
    @Override
    public String toString() {
        return "Triangle{pointA=" + Arrays.toString(pointA) + ", pointB=" + Arrays.toString(pointB) + ", pointC=" + Arrays.toString(pointC) + '}';
    }
}
