package by.htp.library.service.impl;

import by.htp.library.dao.DAOProvider;
import by.htp.library.dao.UserDAO;
import by.htp.library.entity.User;
import by.htp.library.service.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public User logination(String login, String password, String typeOfAccount) {

        if(login == null || password == null) {
            throw new RuntimeException("Error");
        }

        DAOProvider daoProvider = DAOProvider.getInstance();
        UserDAO userDAO = daoProvider.getUserDAO();

        User user;
        user = userDAO.logination(login, password, typeOfAccount);

        return user;
    }

}
