package modul_4.simpleClassesAndObjs.task_8.entity;

import java.util.ArrayList;
import java.util.List;

public class Info {

    private List<Customer> customers;

    public Info () {
        customers = new ArrayList<>();
    }

    public void add (Customer newCustomer) {
        customers.add(newCustomer);
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
    public List<Customer> getCustomers () {
        return customers;
    }
    @Override
    public boolean equals (Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Info other = (Info) o ;
        return customers.equals(other.customers);
    }
    @Override
    public int hashCode () {
        int result = 1;
        for (Customer temp : customers) {
            result = 31*result + (temp == null ? 0 : temp.hashCode());
        }
        return result;
    }
    @Override
    public String toString() {
        return "Info{ customers=" + customers + '}';
    }
}
