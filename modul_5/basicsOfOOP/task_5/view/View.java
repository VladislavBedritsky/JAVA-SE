package modul_5.basicsOfOOP.task_5.view;

import modul_5.basicsOfOOP.task_5.purchases.Customer;
import modul_5.basicsOfOOP.task_5.purchases.PurchaseBouquetByCustomer;
import modul_5.basicsOfOOP.task_5.purchases.PurchaseGiftByCustomer;

import java.util.Scanner;

public class View {

        public static Customer console () {

            Scanner scr = new Scanner(System.in);
            int q = 0;
            do {
                System.out.println("Как вас зовут?");
                String name = scr.nextLine();
                if (name.matches("(\\s{0,1}[A-z]{0,1}[a-z]{2,15}){1,2}")) {
                    q++;
                    System.out.println("Добрый день, " +name);
                }else System.out.println("Некорректное имя.");
            }while (q == 0);
            q = 0;

            System.out.println("______________");


            System.out.println("У нас есть цветы и сладости. Что вы хотите приобрести?(Bouquet/Sweets)");
            String s = scr.nextLine();

            if(s.equalsIgnoreCase("bouquet")) {
                return new PurchaseBouquetByCustomer();
            }else if (s.equalsIgnoreCase("Sweets")) {
                return new PurchaseGiftByCustomer();
            }
            System.out.println("______________");

            throw new RuntimeException("Bouquet/Sweets; другого выбора нет.");
        }
}
