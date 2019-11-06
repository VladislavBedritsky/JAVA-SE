package modul_5.basicsOfOOP.task_5.entity;

import modul_5.basicsOfOOP.task_5.entity.flowers.Flower;

import java.util.ArrayList;
import java.util.List;

public class Bouquet implements Purchase {

    private List<Flower> flowers;

    public Bouquet() {
        flowers = new ArrayList<>();
    }

    public void add (Flower flower) {
        flowers.add(flower);
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }

    @Override
    public int getValue() {
        int result = 0;
        for (Flower temp:this.flowers) {
            result += temp.getPrice();
        }
        return result;
    }

    @Override
    public void printContent() {
        System.out.println("Ваш букет:");
        for (Flower temp : this.flowers) {
            System.out.println(temp.getName()+"("+temp.getPrice()+"$)");
        }
    }

    @Override
    public void printPrice() {
        System.out.println("\nЦена = "+getValue()+"$");
    }
}
