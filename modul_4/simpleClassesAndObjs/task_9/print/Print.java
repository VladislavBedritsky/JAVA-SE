package modul_4.simpleClassesAndObjs.task_9.print;

import modul_4.simpleClassesAndObjs.task_9.untity.Book;

import java.util.List;

public class Print {

    public static void printByAuthor (List<Book> author) {
        for (Book temp : author) {
            System.out.println(temp);
        }
    }
    public static void printByPublishCo (List<Book> publishCo) {
        for (Book temp : publishCo) {
            System.out.println(temp);
        }
    }
    public static void printByYear(List<Book> year) {
        for (Book temp : year) {
            System.out.println(temp);
        }
    }
}
