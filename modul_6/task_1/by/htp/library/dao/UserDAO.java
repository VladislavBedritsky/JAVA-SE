package by.htp.library.dao;

import by.htp.library.entity.User;

public interface UserDAO {

    User logination (String login, String password, String typeOfAccount);

}
