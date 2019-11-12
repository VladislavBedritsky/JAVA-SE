package by.htp.notebook.view;

import by.htp.notebook.controller.Controller;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class View {

    private Controller controller = new Controller();

    public void doAction () {

        System.out.println("Выберите команду:\n"+
                "1.Просмотреть заметки.\n"+
                "2.Добавить заметку.\n"+
                "3.Удалить заметку.\n"+
                "4.Поиск заметки и сортировка по имени.");

        Scanner scr = new Scanner(System.in);
        int s = scr.nextInt();
        String req;
        String response;

        switch (s) {
            case 1:
                controller.doActToDisplayNotes();
                break;
            case 2:
                req = "add_note@ topic===="+noteTopic()+"@ email===="+noteEmail()+"@ message===="+noteMessage()+"@ date===="+noteDate();
                response = controller.doActToAddNote(req);
                System.out.println(response);
                break;
            case 3:
                req = "remove_note@ topic===="+noteTopic();
                response = controller.doActToRemoveNote(req);
                System.out.println(response);
                break;
            case 4:
                System.out.println("Введите ключевое слово для поиска.");
                controller.doActToFindWord(wordForSearch());
                break;
        }
    }

    private String noteTopic() {

        Scanner scr = new Scanner(System.in);
        System.out.println("Введите название заметки:");
        String s;
        s = scr.nextLine();
        return s;
    }

    private String noteEmail() {

        Scanner scr = new Scanner(System.in);
        System.out.println("Email");
        String s;
        s = scr.nextLine();
        return s;
    }

    private String noteMessage() {

        Scanner scr = new Scanner(System.in);
        System.out.println("Message");
        String s;
        s = scr.nextLine();
        return s;
    }

    private String noteDate () {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        SimpleDateFormat a = new SimpleDateFormat("dd.MM.yyyy");
        return a.format(gregorianCalendar.getTime());
    }

    private String wordForSearch (){

        Scanner scr = new Scanner(System.in);
        String s = scr.nextLine();
        Pattern pattern = Pattern.compile("\\w{2,}");
        Matcher matcher = pattern.matcher(s);

        if (matcher.find()) {
            return s;
        } else {
            System.out.println("Слово должно состоять из двух и более букв.");
            System.exit(0);
        }
        return null;
    }
}
