package modul_5.basicsOfOOP.task_2.main;

import modul_5.basicsOfOOP.task_2.entity.Payment;
import modul_5.basicsOfOOP.task_2.entity.Product;
import modul_5.basicsOfOOP.task_2.entity.Shop;
import modul_5.basicsOfOOP.task_2.logic.PaymentLogic;
import modul_5.basicsOfOOP.task_2.logic.ShopLogic;

import java.util.List;

/*
Задача 2.
Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из
нескольких товаров.
 */
public class Main {
    public static void main(String[] args) {

        Shop shop = new Shop();

        shop.add(Product.CHEESE);
        shop.add(Product.BREAD);
        shop.add(Product.CHOCOLATE);
        shop.add(Product.COKE);
        shop.add(Product.CRISPS);
        shop.add(Product.EGGS);
        shop.add(Product.MEAT);
        shop.add(Product.SHAMPOO);
        shop.add(Product.SUGAR);
        shop.add(Product.SWEETS);

        PaymentLogic paymentLogic = new PaymentLogic();
        Payment payment = new Payment(paymentLogic.typeOfPayment());
        System.out.println(payment+" Доступный баланс: "+payment.getTypeOfPayment().getAmount()+"$");

        ShopLogic shopLogic = new ShopLogic(payment);
        List<Product> myPurchases = shopLogic.purchases(shop);
        printPurchases(myPurchases);

    }
    public static void printPurchases (List<Product> myPurchases) {
        System.out.println("Купленные товары:");
        for (Product temp : myPurchases) {
            System.out.println(temp);
        }
    }
}
