package modul_5.basicsOfOOP.task_5.entity;

import modul_5.basicsOfOOP.task_5.entity.sweets.Sweets;

import java.util.ArrayList;
import java.util.List;

public class Gift implements Purchase {

    private List<Sweets> newSweets;

    public Gift() {
        newSweets = new ArrayList<>();
    }

    public void add (Sweets sweets) {
        newSweets.add(sweets);
    }

    public List<Sweets> getNewSweets() {
        return newSweets;
    }

    public void setNewSweets(List<Sweets> newSweets) {
        this.newSweets = newSweets;
    }

    @Override
    public int getValue() {
        int result = 0;
        for (Sweets temp:this.newSweets) {
            result += temp.getPrice();
        }
        return result;
    }

    @Override
    public void printContent() {
        System.out.println("Ваш подарок:");
        for (Sweets temp:this.newSweets) {
            System.out.println(temp.getName()+"("+temp.getPrice()+"$)");
        }
    }

    @Override
    public void printPrice() {
        System.out.println("\nЦена = "+getValue()+"$");
    }


}
