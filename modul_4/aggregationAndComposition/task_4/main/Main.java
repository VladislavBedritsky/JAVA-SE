package modul_4.aggregationAndComposition.task_4.main;

import modul_4.aggregationAndComposition.task_4.entity.Account;
import modul_4.aggregationAndComposition.task_4.entity.Bank;
import modul_4.aggregationAndComposition.task_4.entity.Client;
import modul_4.aggregationAndComposition.task_4.logic.BankLogic;
import modul_4.aggregationAndComposition.task_4.logic.CompareByBalance;
import modul_4.aggregationAndComposition.task_4.print.Print;

import java.util.List;

/*
4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
всем счетам, имеющим положительный и отрицательный балансы отдельно.

 */
public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("SberBank");

        Client client1 = new Client("Traoure K.L.");
        client1.add(new Account(1345,234));
        client1.add(new Account(75342,11));
        client1.add(new Account(363,-45));
        client1.add(new Account(9012,21));

        Client client2 = new Client("Asensio N.Y.");
        client2.add(new Account(311,1112));
        client2.add(new Account(88481,-12));
        client2.add(new Account(7534,-23));
        client2.add(new Account(44002,154));

        bank.add(client1);
        bank.add(client2);

        //отсортированные счета по балансу
        CompareByBalance cbb = new CompareByBalance();
        BankLogic bankLogic = new BankLogic(cbb);
        List<Account> sortedAccountsByBalance = bankLogic.sortByBalance(bankLogic.clientName(bank));
        Print.printAccountsSortedByBalance(sortedAccountsByBalance);

        // Общая сумма счетов клиента, с пол. и отр. балансом
        bankLogic.clientName(bank).sum();

        // блокировка счета
        bankLogic.blockAcc(bankLogic.clientName(bank));

        //разблокировка счета
        bankLogic.unBlockAcc(bankLogic.clientName(bank));
    }
}
