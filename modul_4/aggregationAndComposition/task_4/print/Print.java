package modul_4.aggregationAndComposition.task_4.print;

import modul_4.aggregationAndComposition.task_4.entity.Account;

import java.util.List;

public class Print {

    public static void printAccountsSortedByBalance (List<Account> sortedAccountsByBalance) {
        System.out.println("Отсортированные счета клиента:");
        for (Account temp : sortedAccountsByBalance) {
            System.out.println(temp);
        }
    }
}
