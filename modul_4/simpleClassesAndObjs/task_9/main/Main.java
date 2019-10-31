package modul_4.simpleClassesAndObjs.task_9.main;

import modul_4.simpleClassesAndObjs.task_9.print.Print;
import modul_4.simpleClassesAndObjs.task_9.logic.BookLogic;
import modul_4.simpleClassesAndObjs.task_9.untity.Book;
import modul_4.simpleClassesAndObjs.task_9.untity.Info;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Info info = new Info();

        info.add(new Book(3453,"Harry Potter","J.K.Rowling","HeyMan Co.",1991,678,20,"paper"));
        info.add(new Book(145,"Two and a half man","D.L.Pupkin","Tillimans Int.",2013,245,3,"digital"));
        info.add(new Book(734,"Introduction to Java","P.S.Rooney","Plusme Co.",2013,343,13,"paper"));
        info.add(new Book(2257,"How to get friends","J.K.Keane","LSD Int.",2009,127,15,"paper"));
        info.add(new Book(86,"Lord of the rings","L.O.Mount","TextAndPrint Co.",1995,879,21,"paper"));
        info.add(new Book(901,"Tripitaka","K.E.Budda","Sansara Corp.",2018,3209,8,"digital"));

        BookLogic bookLogic = new BookLogic();

        List<Book> author = bookLogic.outputByAuthor(info);
        Print.printByAuthor(author);
        System.out.println("_____________________________________");

        List<Book> publishCo = bookLogic.outputByPublishCo(info);
        Print.printByPublishCo(publishCo);
        System.out.println("_____________________________________");

        List<Book> year = bookLogic.outputByYear(info);
        Print.printByYear(year);
    }
}
