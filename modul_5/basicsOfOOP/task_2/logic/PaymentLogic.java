package modul_5.basicsOfOOP.task_2.logic;

import modul_5.basicsOfOOP.task_2.entity.TypeOfPayment;

import java.util.Scanner;

public class PaymentLogic  {

    public TypeOfPayment typeOfPayment () {

        Scanner scr = new Scanner(System.in);
        int q = 0;
        String s;
        TypeOfPayment x;
        do {
            System.out.println("Каким способом собираетесь оплачивать покупки?(Cash/Credit_card)");
            s = scr.nextLine();

            if (s.equalsIgnoreCase(TypeOfPayment.CASH.toString())) {
                return TypeOfPayment.CASH;
            }else if (s.equalsIgnoreCase(TypeOfPayment.CREDIT_CARD.toString())) {
                return TypeOfPayment.CREDIT_CARD;
            }else System.out.println("У вас такого способа оплаты нет.");

        } while (true);
    }

}
