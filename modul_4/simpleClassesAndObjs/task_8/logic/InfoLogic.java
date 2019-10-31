package modul_4.simpleClassesAndObjs.task_8.logic;

import modul_4.simpleClassesAndObjs.task_8.entity.Customer;
import modul_4.simpleClassesAndObjs.task_8.entity.Info;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InfoLogic {

    private OutputByName outN;

    public InfoLogic (OutputByName outN) {
        this.outN = outN;
    }

    public List<Customer> sortByName (Info info) {
        List<Customer> result = info.getCustomers();
        result.sort(outN);
        return new ArrayList<>(result);
    }

    public List<Customer> takeCreditCard (Info info) {

        List<Customer> result = new ArrayList<>();
        List<Customer> x = info.getCustomers();
        int k = 0;
        BigInteger q;

        Scanner scr = new Scanner(System.in);
        do {
            System.out.println("Для поиска введите номер банкоской карты клиента(16чисел):");
            q = scr.nextBigInteger();
            int q1 = q.intValue();
            for (Customer temp : x) {
                if (temp.getCardNumber().intValue() == q1) {
                    result.add(temp);
                    k++;
                }
            }
            if (k == 0) {
                System.out.println("Банковских карт с таким номером не найдено! Попробуйте ввести заново!");
            }
        }while (k == 0);
        return result;
    }


}
