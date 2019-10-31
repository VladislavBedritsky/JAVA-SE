package modul_4.aggregationAndComposition.task_3.main;

import modul_4.aggregationAndComposition.task_3.entity.City;
import modul_4.aggregationAndComposition.task_3.entity.Country;
import modul_4.aggregationAndComposition.task_3.entity.Region;

public class Main {
    public static void main(String[] args) {

        City capital = new City("Minsk");
        Country country = new Country("Belarus",capital);

        country.add(new Region("Minsk region",capital,40.2));
        country.add(new Region("Brest region",new City("Brest"),32.8));
        country.add(new Region("Vitebsk region",new City("Vitebsk"),40.0));
        country.add(new Region("Gomel region",new City("Gomel"),40.4));
        country.add(new Region("Grodno region",new City("Grodno"),25.1));
        country.add(new Region("Mogilev region",new City("Mogilev"),29.1));

        country.printCapital();
        country.printAmountOfRegions();
        country.printSquare();
        country.printCities();

    }
}
