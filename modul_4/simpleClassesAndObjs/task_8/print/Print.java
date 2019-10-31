package modul_4.simpleClassesAndObjs.task_8.print;

import modul_4.simpleClassesAndObjs.task_8.entity.Customer;

import java.util.List;

public class Print {

    public static void printByName(List<Customer> sortedByNameResult) {
        for (Customer temp : sortedByNameResult) {
            System.out.println(temp);
        }
    }

    public static void cardholder(List<Customer> credit) {
        for (Customer temp : credit) {
            System.out.println(temp);
        }
    }
}
