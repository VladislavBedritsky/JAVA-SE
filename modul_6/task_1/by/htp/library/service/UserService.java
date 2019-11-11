package by.htp.library.service;

import by.htp.library.entity.User;

public interface UserService {

    User logination(String login, String password, String typeOfAccount);

}
