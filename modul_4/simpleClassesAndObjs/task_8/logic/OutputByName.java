package modul_4.simpleClassesAndObjs.task_8.logic;

import modul_4.simpleClassesAndObjs.task_8.entity.Customer;

import java.util.Comparator;

public class OutputByName implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        int result;
        result = o1.getName().compareTo(o2.getName());
        if(result != 0) {
            return result;
        }
        return result;
    }
}
