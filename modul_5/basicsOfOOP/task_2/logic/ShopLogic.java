package modul_5.basicsOfOOP.task_2.logic;

import modul_5.basicsOfOOP.task_2.entity.Payment;
import modul_5.basicsOfOOP.task_2.entity.Product;
import modul_5.basicsOfOOP.task_2.entity.Shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShopLogic {

    private Payment payment;

    public ShopLogic (Payment payment) {
        this.payment = payment;
    }
    public List<Product> purchases (Shop shop) {

        List<Product> result = new ArrayList<>();
        List<Product> x = shop.getProducts();

        Scanner scr = new Scanner(System.in);
        String s;
        int q = 0;
        int k = 0;
        double balance = payment.getTypeOfPayment().getAmount();
        do {
            System.out.println("Выберите продукты из списка для покупки. Для выхода из магазина введите Exit.");
            s = scr.nextLine();
            for (Product temp : x) {
                if (s.equalsIgnoreCase(temp.toString())) {
                    result.add(temp);
                    balance -= temp.getValue();
                    k++;
                    if (balance < 0) {
                        result.remove(temp);
                        balance += temp.getValue();
                        System.out.println("У вас недостаточно средств для этого товара.");
                    }
                } else if (s.equalsIgnoreCase("exit")) {
                    q++;
                }
            }

            if (k == 0) {
                System.out.println("Такого продукта у нас нет.");
            }
            k = 0;
            System.out.println("Остаток ваших средств: "+balance+""+payment.getTypeOfPayment().getCurrency());
        }while (q == 0 && balance > 0);
        return result;
    }
}
