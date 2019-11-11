package by.htp.library.service;

import by.htp.library.entity.Book;
import by.htp.library.entity.TypeOfBook;

public interface LibraryService {

     Book addBook (String title, TypeOfBook typeOfBook);

     Book removeBook (String title, TypeOfBook typeOfBook);

     void displayBook();

     void findBookByTitle(String title);

     void findBookByType(TypeOfBook typeOfBook);
}
