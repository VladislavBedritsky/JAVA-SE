package modul_4.simpleClassesAndObjs.task_9.logic;

import modul_4.simpleClassesAndObjs.task_9.untity.Book;
import modul_4.simpleClassesAndObjs.task_9.untity.Info;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookLogic {

    public List<Book> outputByAuthor (Info info) {

        List<Book> result = new ArrayList<>();
        List<Book> x = info.getBooks();
        Scanner scr = new Scanner(System.in);
        int k = 0;
        String q;
        System.out.println("Введите название автора:");
        do {
            q = scr.nextLine();
            for (Book temp : x) {
                if (q.equalsIgnoreCase(temp.getAuthor())) {
                    result.add(temp);
                    k++;
                }
            }
            if( k == 0 ) {
                System.out.println("Книг с таким автором нет! Попробуйте еще раз");
            }
        } while (k == 0);
        return result;
    }

    public List<Book> outputByPublishCo (Info info) {

        List<Book> result = new ArrayList<>();
        List<Book> x = info.getBooks();
        Scanner scr = new Scanner(System.in);
        int k = 0;
        String q;
        System.out.println("Введите название издательства:");
        do {
            q = scr.nextLine();
            for (Book temp : x) {
                if (q.equalsIgnoreCase(temp.getPublishCompany())) {
                    result.add(temp);
                    k++;
                }
            }
            if( k == 0 ) {
                System.out.println("Книг, выпущенных таким издательством нет! Попробуйте еще раз");
            }
        } while (k == 0);
        return result;
    }

    public List<Book> outputByYear (Info info) {

        List<Book> result = new ArrayList<>();
        List<Book> x = info.getBooks();
        Scanner scr = new Scanner(System.in);
        int k = 0;
        int q;
        System.out.println("Введите нужный вам год, после которого были выпущены книги:");
        do {
            q = scr.nextInt();
            for (Book temp : x) {
                if (q < temp.getYear()) {
                    result.add(temp);
                    k++;
                }
            }
            if( k == 0 ) {
                System.out.println("Книг, выпущенных, после интересующего вас года, нет! Попробуйте еще раз");
            }
        } while (k == 0);
        return result;
    }
}
