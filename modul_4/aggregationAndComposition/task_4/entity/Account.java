package modul_4.aggregationAndComposition.task_4.entity;

import java.util.Objects;

public class Account {

    private int id;
    private int balance;

    public Account (int id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id &&
                balance == account.balance;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, balance);
    }
    @Override
    public String toString() {
        return "id"+id +" = ("+balance+"$)\n";
    }
}
