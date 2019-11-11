package by.htp.library.controller.command.impl;

import by.htp.library.controller.command.Command;
import by.htp.library.entity.Book;
import by.htp.library.entity.TypeOfBook;
import by.htp.library.service.LibraryService;
import by.htp.library.service.ServiceProvider;

public class AddBookCommand implements Command {


    @Override
    public String execute(String[] params) {

        String title;
        TypeOfBook typeOfBook;

        title = params[0];
        typeOfBook = TypeOfBook.valueOf(params[1]);

        ServiceProvider serviceProvider = ServiceProvider.getInstance();
        LibraryService libraryService = serviceProvider.getLibraryService();
        Book book = libraryService.addBook(title,typeOfBook);

        String response;
        if (book != null) {
            response = "Книга добавлена.";
        } else {
            response = "Книга не добавлена!";
        }
        return response;
    }


}
