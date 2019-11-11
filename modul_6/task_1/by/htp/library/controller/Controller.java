package by.htp.library.controller;

import by.htp.library.controller.command.Command;
import by.htp.library.controller.command.CommandProvider;
import by.htp.library.entity.TypeOfBook;
import by.htp.library.service.LibraryService;
import by.htp.library.service.SendMaleService;
import by.htp.library.service.ServiceProvider;

import javax.mail.*;

public class Controller {

    private CommandProvider commandProvider = new CommandProvider();

    public String doActionUser (String request) {

        String[] params = request.split("\\s+");
        String commandName = params[3];
        String response = null;

        Command command = commandProvider.getCommand(commandName);
        response = command.execute(params);

        return response;
    }

    public String doActionToAddBook (String request) {

        String [] params = request.split("@");
        String commandName = "add_new_book";

        Command command = commandProvider.getCommand(commandName);
        String response = command.execute(params);

        return response;
    }

    public String doActionToRemoveBook (String request) {

        String [] params = request.split("@");
        String commandName = "remove_book";

        Command command = commandProvider.getCommand(commandName);
        String response = command.execute(params);

        return response;
    }

    public void doActionToDisplayBooks() {

        System.out.println("Список книг:\n_______________");

        ServiceProvider serviceProvider = ServiceProvider.getInstance();
        LibraryService libraryService = serviceProvider.getLibraryService();
        libraryService.displayBook();

    }

    public void doActionToFindBookByTitle(String title) {

        System.out.println("Список книг:\n_______________");

        ServiceProvider serviceProvider = ServiceProvider.getInstance();
        LibraryService libraryService = serviceProvider.getLibraryService();
        libraryService.findBookByTitle(title);

    }

    public void doActionToFindBookByType(TypeOfBook typeOfBook) {

        System.out.println("Список книг:\n_______________");

        ServiceProvider serviceProvider = ServiceProvider.getInstance();
        LibraryService libraryService = serviceProvider.getLibraryService();
        libraryService.findBookByType(typeOfBook);

    }

    public void sendMaleToUserAboutNewBook (String string) throws MessagingException {

        ServiceProvider serviceProvider = ServiceProvider.getInstance();
        SendMaleService sendMaleService = serviceProvider.getSendMaleService();
        sendMaleService.sendMailToUsers(string);

    }

    public void sendMaleToAdmin (String bookName, String userEmail, String userPassword) throws MessagingException {

        ServiceProvider serviceProvider = ServiceProvider.getInstance();
        SendMaleService sendMaleService = serviceProvider.getSendMaleService();
        sendMaleService.sendMailToAdmin(bookName,userEmail,userPassword);

    }
}
