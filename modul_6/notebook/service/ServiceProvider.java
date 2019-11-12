package by.htp.notebook.service;

import by.htp.notebook.service.impl.NoteServiceImpl;

public class ServiceProvider {

    private static final ServiceProvider instance = new ServiceProvider();

    private NoteService noteService = new NoteServiceImpl();

    private ServiceProvider(){}

    public static ServiceProvider getInstance() {
        return instance;
    }

    public NoteService getNoteService() {
        return noteService;
    }

    public void setNoteService(NoteService noteService) {
        this.noteService = noteService;
    }
}
