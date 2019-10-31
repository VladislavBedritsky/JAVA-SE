package modul_4.aggregationAndComposition.task_5.Print;

import modul_4.aggregationAndComposition.task_5.entity.TourPackage;

import java.util.List;

public class Print {

    public static void printSortedByTr (List<TourPackage> sortedByTr) {
        if (sortedByTr.size() == 0) {
            System.out.println("У нашей турфирмы нет путевок, по заданным вами параметрам! ");
        } else {
            System.out.println("Спасибо за покупку!)");
            System.out.println("___________");
            for (TourPackage temp : sortedByTr) {
                System.out.println(temp);
            }

        }
    }
}
