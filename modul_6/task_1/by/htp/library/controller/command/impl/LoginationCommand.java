package by.htp.library.controller.command.impl;

import by.htp.library.controller.command.Command;
import by.htp.library.entity.User;
import by.htp.library.service.ServiceProvider;
import by.htp.library.service.UserService;

public class LoginationCommand implements Command {
    @Override
    public String execute(String[] params) {

        String login;
        String password;
        String typeOfAccount;

        login = params[1].split("=")[1];
        password = params[2].split("=")[1];
        typeOfAccount = params[3];

        ServiceProvider serviceProvider = ServiceProvider.getInstance();
        UserService userService = serviceProvider.getUserService();
        User user = userService.logination(login,password,typeOfAccount);

        String response = null;
        if(user != null) {
            response = "Hello, "+typeOfAccount;
        }else {
            response = "Логин или пароль введены неверно.";
        }
        return response;

    }
}
