package modul_4.aggregationAndComposition.task_4.logic;

import modul_4.aggregationAndComposition.task_4.entity.Account;

import java.util.Comparator;

public class CompareByBalance implements Comparator<Account> {
    @Override
    public int compare(Account o1, Account o2) {
        int result;
        result = Integer.compare(o1.getBalance(),o2.getBalance());
        if (result != 0) {
            return result;
        }
        return result;
    }
}
