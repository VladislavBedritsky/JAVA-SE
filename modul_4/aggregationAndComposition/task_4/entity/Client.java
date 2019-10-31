package modul_4.aggregationAndComposition.task_4.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Client {

    private String name;
    private List<Account> accounts;

    public Client (String name) {
        this.name = name;
        accounts = new ArrayList<>();
    }

    public void add (Account temp) {
        accounts.add(temp);
    }

    public void sum () {
        int sum = 0;
        int plusSum = 0;
        int minusSum = 0;
        for (Account temp : accounts) {
            sum += temp.getBalance();
            if (temp.getBalance() >= 0) {
                plusSum += temp.getBalance();
            } else {
                minusSum += temp.getBalance();
            }
        }
        System.out.println("Общая сумма счетов клиента = "+sum+"$\n" +
                "Сумма счетов клиента c положительным балансом = "+plusSum+"$\n" +
                "Сумма счетов клиента c отрицательным балансом = "+minusSum+"$");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Account> getAccounts() {
        return accounts;
    }
    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return name.equals(client.name) &&
                accounts.equals(client.accounts);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, accounts);
    }
    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}
