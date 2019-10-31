package modul_4.aggregationAndComposition.task_5.Main;

import modul_4.aggregationAndComposition.task_5.Print.Print;
import modul_4.aggregationAndComposition.task_5.Logic.TourOperatorLogic;
import modul_4.aggregationAndComposition.task_5.entity.TourOperator;
import modul_4.aggregationAndComposition.task_5.entity.TourPackage;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        TourOperator tourOperator = new TourOperator("Travelgroup Inc.");

        tourOperator.add(new TourPackage("Caribbean sea","Cruise","Ship","All inclusive",12));
        tourOperator.add(new TourPackage("Paris","Excursion","Bus","None",3));
        tourOperator.add(new TourPackage("Los Angeles","Relax","Plane","None",21));
        tourOperator.add(new TourPackage("Bialowezha forest","Therapy","Bus","All inclusive",10));
        tourOperator.add(new TourPackage("Milan","Shopping","Plane","Breakfast",4));
        tourOperator.add(new TourPackage("Krakow","Excursion","Train","None",3));
        tourOperator.add(new TourPackage("Egypt","Relax","Plane","All inclusive",18));
        tourOperator.add(new TourPackage("Norway","Cruise","Ship","All inclusive",12));
        tourOperator.add(new TourPackage("Switzerland","Therapy","Bus","All inclusive",23));

        TourOperatorLogic tourOperatorLogic = new TourOperatorLogic();
        List<TourPackage> sortByTr = tourOperatorLogic.sortByTr(tourOperator);
        Print.printSortedByTr(sortByTr);
    }

}
