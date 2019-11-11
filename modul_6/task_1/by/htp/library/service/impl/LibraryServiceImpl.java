package by.htp.library.service.impl;

import by.htp.library.dao.DAOProvider;
import by.htp.library.dao.LibraryDAO;
import by.htp.library.entity.Book;
import by.htp.library.entity.TypeOfBook;
import by.htp.library.service.LibraryService;

public class LibraryServiceImpl implements LibraryService {

    @Override
    public Book addBook(String title, TypeOfBook typeOfBook) {

        if (title == null || typeOfBook == null) {
            throw new RuntimeException("Error");
        }

        DAOProvider daoProvider = DAOProvider.getInstance();
        LibraryDAO libraryDAO = daoProvider.getLibraryDAO();

        Book book;
        book = libraryDAO.add(title,typeOfBook);

        return book;
    }

    @Override
    public Book removeBook(String title, TypeOfBook typeOfBook) {

        if (title == null || typeOfBook == null) {
            throw new RuntimeException("Error");
        }

        DAOProvider daoProvider = DAOProvider.getInstance();
        LibraryDAO libraryDAO = daoProvider.getLibraryDAO();

        Book book;
        book = libraryDAO.remove(title,typeOfBook);

        return book;
    }

    @Override
    public void displayBook() {

        DAOProvider daoProvider = DAOProvider.getInstance();
        LibraryDAO libraryDAO = daoProvider.getLibraryDAO();
        libraryDAO.display();

    }

    @Override
    public void findBookByTitle(String title) {
        if (title == null) {
            throw new RuntimeException("Error");
        }

        DAOProvider daoProvider = DAOProvider.getInstance();
        LibraryDAO libraryDAO = daoProvider.getLibraryDAO();
        libraryDAO.findByTitle(title);

    }

    @Override
    public void findBookByType(TypeOfBook typeOfBook) {

        if(typeOfBook == null) {
            throw new RuntimeException("Error");
        }

        DAOProvider daoProvider = DAOProvider.getInstance();
        LibraryDAO libraryDAO = daoProvider.getLibraryDAO();
        libraryDAO.findByType(typeOfBook);
    }

}
