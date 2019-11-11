package by.htp.library.dao;

import by.htp.library.dao.impl.FileLibraryDAO;
import by.htp.library.dao.impl.FileUserDAO;

public class DAOProvider {

    private static final DAOProvider instance = new DAOProvider();

    private UserDAO userDAO = new FileUserDAO();
    private LibraryDAO libraryDAO = new FileLibraryDAO();

    private DAOProvider() {}

    public static DAOProvider getInstance () {
        return instance;
    }

    public UserDAO getUserDAO () {
        return userDAO;
    }

    public LibraryDAO getLibraryDAO() {return libraryDAO;}

}
