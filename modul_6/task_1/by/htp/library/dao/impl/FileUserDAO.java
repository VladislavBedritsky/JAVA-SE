package by.htp.library.dao.impl;

import by.htp.library.dao.UserDAO;
import by.htp.library.entity.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileUserDAO implements UserDAO {

    @Override
    public User logination(String login, String password, String typeOfAccount) {

        String s;
        User user = new User();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/by/htp/library/source/userInfo.txt"));
            while ((s = bufferedReader.readLine()) != null ) {
                String[] params = s.split("\\s+");
                if (login.equals(params[1].split("=")[1]) && password.equals(params[2].split("=")[1]) && typeOfAccount.equals(params[3])) {
                    return user;
                }
            }
            bufferedReader.close();
        }catch (IOException e){
            System.out.println("файл не найден");
        }

    return null;
    }
}
