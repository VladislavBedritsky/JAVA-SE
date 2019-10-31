package modul_4.simpleClassesAndObjs.task_7.main;

import modul_4.simpleClassesAndObjs.task_7.entity.Triangle;
import modul_4.simpleClassesAndObjs.task_7.logic.TriangleLogic;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(new double[]{2, -2},new double[]{-1, 2},new double[]{1, -1});
        TriangleLogic triangleLogic = new TriangleLogic();
        System.out.println("Сторона AB = "+triangleLogic.sideAB(triangle));
        System.out.println("Сторона BC = "+triangleLogic.sideBC(triangle));
        System.out.println("Сторона CA = "+triangleLogic.sideAC(triangle));
        System.out.println("Периметр = "+triangleLogic.perimeter(triangle));
        System.out.println("Площадь = "+triangleLogic.square(triangle));
        System.out.println("Точка пересечения медиан = "+Arrays.toString(triangleLogic.median(triangle)));
    }
}
