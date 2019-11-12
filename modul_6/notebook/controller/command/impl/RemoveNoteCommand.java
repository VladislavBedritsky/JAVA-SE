package by.htp.notebook.controller.command.impl;

import by.htp.notebook.controller.command.Command;
import by.htp.notebook.entity.Note;
import by.htp.notebook.service.NoteService;
import by.htp.notebook.service.ServiceProvider;

public class RemoveNoteCommand implements Command {
    @Override
    public String execute(String[] params) {

        String topic;

        topic = params[1].split("====")[1];

        ServiceProvider serviceProvider = ServiceProvider.getInstance();
        NoteService noteService = serviceProvider.getNoteService();
        Note note = noteService.remove(topic);

        String response = null;
        if(note != null) {
            response = "Note "+note.getTopic()+" is removed from notebook.";
        }else response = "Note isn't found.";

        return response;
    }
}
