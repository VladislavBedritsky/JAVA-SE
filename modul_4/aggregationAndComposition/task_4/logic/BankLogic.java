package modul_4.aggregationAndComposition.task_4.logic;

import modul_4.aggregationAndComposition.task_4.entity.Account;
import modul_4.aggregationAndComposition.task_4.entity.Bank;
import modul_4.aggregationAndComposition.task_4.entity.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankLogic {

    private CompareByBalance cbb;

    public BankLogic (CompareByBalance cbb) {
        this.cbb = cbb;
    }

    public List<Account> sortByBalance (Client client) {

        List<Account> accounts = client.getAccounts();
        accounts.sort(cbb);
        return new ArrayList<>(accounts);

    }

    public Client clientName (Bank bank) {
        List<Client> x = bank.getClients();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя клиента:");
        int q = 0;
        String s;
        Client z = null;
        do {
            s = scanner.nextLine();
            for (Client temp : x) {
                if (s.equalsIgnoreCase(temp.getName())) {
                    q++;
                    z = temp;
                }
            }
            if (q == 0) {
                System.out.println("Такого клиента у нас в базе не существует.");
            }
        }while (q == 0);
        return z;
    }

    public void blockAcc (Client client) {
        List<Account> accounts = client.getAccounts();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер счета этого клиента для блокировки: ");
        int q = 0;
        int numb;
        do {
            numb = scanner.nextInt();
            for (Account temp : accounts) {
                if (numb == temp.getId()) {
                    System.out.println("Счет "+numb+" заблокирован!");
                    q++;
                }
            }
            if (q == 0) {
                System.out.println("Такого счета не существует. Попоробуйте еще раз.");
            }
        } while (q == 0);
    }

    public void unBlockAcc (Client client) {
        List<Account> accounts = client.getAccounts();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер счета этого клиента для разблокировки: ");
        int q = 0;
        int numb;
        do {
            numb = scanner.nextInt();
            for (Account temp : accounts) {
                if (numb == temp.getId()) {
                    System.out.println("Счет "+numb+" разблокирован!");
                    q++;
                }
            }
            if (q == 0) {
                System.out.println("Такого счета не существует. Попоробуйте еще раз.");
            }
        } while (q == 0);
    }

}
