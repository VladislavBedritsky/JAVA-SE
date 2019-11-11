package by.htp.library.dao;

import by.htp.library.entity.Book;
import by.htp.library.entity.TypeOfBook;

import java.util.List;

public interface LibraryDAO {

    Book add(String title, TypeOfBook typeOfBook);

    Book remove(String title, TypeOfBook typeOfBook);

    void display();

    void findByTitle (String title);

    void findByType (TypeOfBook typeOfBook);

}
