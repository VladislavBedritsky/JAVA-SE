package modul_5.basicsOfOOP.task_4.view;

import modul_5.basicsOfOOP.task_4.logic.TreasureLogic;

import java.io.IOException;
import java.util.Scanner;

public class View {

    private TreasureLogic treasureLogic;

    public View (TreasureLogic treasureLogic) {
        this.treasureLogic = treasureLogic;
    }

    public  void result () throws IOException {
        System.out.println("Введите 1 для просмотра сокровищ.\n" +
                "Введите 2 для вывода сокровища с макс. стоимостью.\n" +
                "Введите 3 для вывода сокровищ на заданную сумму.\n" +
                "Выход из программы - 0");

        Scanner scr = new Scanner(System.in);
        int sw;
        int q = 0;
        do {
            sw = scr.nextInt();
            if (sw >= 0 && sw <= 3) {
                q++;
            }else System.out.println("Такой команды не существует.");
        } while (q == 0);

        switch (sw) {
            case 0:
                System.exit(0);
                break;
            case 1:
                treasureLogic.printOurTreasures(treasureLogic.ourTreasures());
                break;
            case 2:
                treasureLogic.expensiveTreasure(treasureLogic.ourTreasures());
                break;
            case 3:
                treasureLogic.setValueTreasure(treasureLogic.ourTreasures());
                break;
        }
    }

}
