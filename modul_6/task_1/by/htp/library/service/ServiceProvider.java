package by.htp.library.service;

import by.htp.library.service.impl.LibraryServiceImpl;
import by.htp.library.service.impl.SendMaleServiceImpl;
import by.htp.library.service.impl.UserServiceImpl;

public class ServiceProvider {

    private static final ServiceProvider instance = new ServiceProvider();

    private UserService userService = new UserServiceImpl();
    private LibraryService libraryService = new LibraryServiceImpl();
    private SendMaleService sendMaleService = new SendMaleServiceImpl();

    private ServiceProvider(){}

    public static ServiceProvider getInstance () {
        return instance;
    }
    public UserService getUserService() {
        return userService;
    }
    public LibraryService getLibraryService() {return libraryService;}
    public SendMaleService getSendMaleService(){return sendMaleService;}

}
