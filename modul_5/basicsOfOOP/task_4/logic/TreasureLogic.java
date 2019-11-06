package modul_5.basicsOfOOP.task_4.logic;

import modul_5.basicsOfOOP.task_4.entity.KitOfTreasure;
import modul_5.basicsOfOOP.task_4.entity.Treasure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TreasureLogic {

    public KitOfTreasure ourTreasures () throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/modul_5/basicsOfOOP/task_4/info/rewards.txt"));
        String s;
        KitOfTreasure kitOfTreasure = new KitOfTreasure();
        int i = 1;
        try {
            while ((s = bufferedReader.readLine()) != null) {
                 kitOfTreasure.add(new Treasure(i,s,(int)(Math.random()*10000)));
                 i++;
            }

        } catch (IOException e) {
            System.out.println("Файл не найден.");

        }
        bufferedReader.close();
            return kitOfTreasure;
    }

    public void printOurTreasures (KitOfTreasure kitOfTreasure) {

        List<Treasure> x = kitOfTreasure.getTreasures();

            for(Treasure temp:x) {
                System.out.println(temp.getId()+". "+temp.getName()+" = "+temp.getValue()+"pS.");
            }
        System.out.println("____________________");
    }

    public void expensiveTreasure (KitOfTreasure kitOfTreasure) {

        List<Treasure> x = kitOfTreasure.getTreasures();
        int max = 0;

        for (Treasure temp : x) {
            if(max < temp.getValue()) {
                max = temp.getValue();
            }
        }
        System.out.println("Сокровище с самой максимальной ценой:");
        for (Treasure temp:x) {
            if(max == temp.getValue()){
                System.out.println(temp.getId()+"."+temp.getName()+" = "+temp.getValue()+"pS.");
            }
        }
        System.out.println("____________________");
    }

    public void setValueTreasure (KitOfTreasure kitOfTreasure) {

        int setVal,id;
        int q = 0;
        List<Treasure> x = kitOfTreasure.getTreasures();
        List<Treasure> result = new ArrayList<>();
        System.out.println("Задайте значение:");
        Scanner scr = new Scanner(System.in);
        setVal = scr.nextInt();

        do {
            System.out.println("Введите порядковый номер элемента для покупки (Для выхода - 0):");
            do {
                id = scr.nextInt();
                if (id >= 0 && id <= x.size()) {
                    q++;
                }else System.out.println("Такого элемента не существует.");
            } while (q == 0);
            q = 0;
            for (Treasure temp:x) {
                if (id == temp.getId()) {
                    setVal -= temp.getValue();
                    result.add(temp);
                    System.out.println(temp.getId()+"."+temp.getName()+" = "+temp.getValue()+"pS.");
                    if (setVal < 0) {
                        setVal += temp.getValue();
                        result.remove(temp);
                        System.out.println("У вас недостаточно средств.");
                    }else {
                        System.out.println("Ваш баланс  = "+setVal+"pS.");
                    }
                }
            }
            if (id == 0) {
                q++;
            }
        }while (q == 0);

        System.out.println("Ваш баланс = "+setVal+"pS.");
        System.out.println("Купленные сокровища: ");
        for (Treasure temp : result) {
            System.out.println(temp.getName());
        }
    }

}
