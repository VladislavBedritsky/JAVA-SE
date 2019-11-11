package by.htp.library.service;

import javax.mail.MessagingException;

public interface SendMaleService {

    void sendMailToUsers (String title) throws MessagingException;

    void sendMailToAdmin (String title, String userEmail, String userPassword) throws MessagingException;

}
