package modul_4.simpleClassesAndObjs.task_7.logic;

import modul_4.simpleClassesAndObjs.task_7.entity.Triangle;

public class TriangleLogic {

    public double sideAB (Triangle triangle) {
        double [] a = triangle.getPointA();
        double [] b = triangle.getPointB();
        double x1 = a[0];
        double y1 = a[1];
        double x2 = b[0];
        double y2 = a[1];
        return Math.sqrt(Math.pow((x1 - x2),2) + Math.pow((y1 - y2),2));
    }

    public double sideBC (Triangle triangle) {

        double [] b = triangle.getPointB();
        double [] c = triangle.getPointC();
        double x2 = b[0];
        double y2 = b[1];
        double x3 = c[0];
        double y3 = c[1];
        return Math.sqrt(Math.pow((x2 - x3),2) + Math.pow((y2 - y3),2));
    }

    public double sideAC (Triangle triangle) {

        double [] a = triangle.getPointA();
        double [] c = triangle.getPointC();
        double x1 = a[0];
        double y1 = a[1];
        double x3 = c[0];
        double y3 = c[1];
        return Math.sqrt(Math.pow((x1 - x3),2) + Math.pow((y1 - y3),2));
    }

    public double perimeter (Triangle triangle) {
        return sideAB(triangle) + sideBC(triangle) + sideAC(triangle);
    }

    public double square (Triangle triangle) {
        double p = perimeter(triangle)/2;
        return Math.sqrt(p * (p - sideAB(triangle))*(p - sideBC(triangle))*(p - sideAC(triangle)));
    }

    public double[] median (Triangle triangle) {
        double [] a = triangle.getPointA();
        double [] b = triangle.getPointB();
        double [] c = triangle.getPointC();
        double x1 = a[0];
        double y1 = a[1];
        double x2 = b[0];
        double y2 = b[1];
        double x3 = c[0];
        double y3 = c[1];

        double[] result = new double[2];
        result[0] = (x1 + x2 + x3)/3;;
        result[1] = (y1 + y2 + y3)/3;
        return result;
    }
}
