package by.htp.notebook.controller.command.impl;

import by.htp.notebook.controller.command.Command;
import by.htp.notebook.entity.Note;
import by.htp.notebook.service.NoteService;
import by.htp.notebook.service.ServiceProvider;

public class AddNewNoteCommand implements Command {
    @Override
    public String execute(String[] params) {

        String topic;
        String email;
        String message;
        String date;

        topic = params[1].split("====")[1];
        email = params[2].split("====")[1];
        message = params[3].split("====")[1];
        date = params[4].split("====")[1];

        ServiceProvider serviceProvider = ServiceProvider.getInstance();
        NoteService noteService = serviceProvider.getNoteService();
        Note note = noteService.add(topic, date,email,message);

        String response;
        if (note != null) {
            response = "Note "+note.getTopic()+" is added to notebook.";
        }else response = "Note isn't added to notebook";
        return response;
    }
}
