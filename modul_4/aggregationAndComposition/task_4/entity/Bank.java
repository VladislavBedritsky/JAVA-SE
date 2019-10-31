package modul_4.aggregationAndComposition.task_4.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bank {

    private String name;
    private List<Client> clients;

    public Bank(String name) {
        this.name = name;
        clients = new ArrayList<>();
    }

    public void add (Client temp) {
        clients.add(temp);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Client> getClients() {
        return clients;
    }
    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return name.equals(bank.name) &&
                clients.equals(bank.clients);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, clients);
    }
    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", clients=" + clients +
                '}';
    }
}
