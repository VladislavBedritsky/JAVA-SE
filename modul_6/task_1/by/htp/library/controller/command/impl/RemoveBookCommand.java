package by.htp.library.controller.command.impl;

import by.htp.library.controller.command.Command;
import by.htp.library.entity.Book;
import by.htp.library.entity.TypeOfBook;
import by.htp.library.service.LibraryService;
import by.htp.library.service.ServiceProvider;

public class RemoveBookCommand implements Command {


    @Override
    public String execute(String[] params) {

        String name;
        TypeOfBook typeOfBook;

        name = params[0];
        typeOfBook = TypeOfBook.valueOf(params[1]);

        ServiceProvider serviceProvider = ServiceProvider.getInstance();
        LibraryService libraryService = serviceProvider.getLibraryService();
        Book book;
        book = libraryService.removeBook(name,typeOfBook);

        String response;
        if(book != null) {
            response = "Книга удалена.";
        } else response = "Книга не удалена.";

        return response;
    }
}
