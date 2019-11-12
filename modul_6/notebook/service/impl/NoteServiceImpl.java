package by.htp.notebook.service.impl;

import by.htp.notebook.dao.DAOProvider;
import by.htp.notebook.dao.NoteDAO;
import by.htp.notebook.entity.Note;
import by.htp.notebook.service.NoteService;

import java.util.List;

public class NoteServiceImpl implements NoteService {

    private CompareByTopic compareByTopic = new CompareByTopic();

    @Override
    public void display() {

        DAOProvider daoProvider = DAOProvider.getInstance();
        NoteDAO noteDAO = daoProvider.getNoteDAO();
        noteDAO.display();
    }

    @Override
    public Note add(String topic, String date, String email, String message) {

        if (topic == null ) {
            throw new RuntimeException("Error");
        }

        DAOProvider daoProvider = DAOProvider.getInstance();
        NoteDAO noteDAO = daoProvider.getNoteDAO();
        Note note;
        note = noteDAO.add(topic,date,email,message);

        return note;
    }

    @Override
    public Note remove(String topic) {
        if (topic == null ) {
            throw new RuntimeException("Error");
        }

        DAOProvider daoProvider = DAOProvider.getInstance();
        NoteDAO noteDAO = daoProvider.getNoteDAO();
        Note note;
        note = noteDAO.remove(topic);

        return note;
    }

    @Override
    public void findWordInMessageAndSortByTopic(String word) {

        if (word == null ) {
            throw new RuntimeException("word == null");
        }

        DAOProvider daoProvider = DAOProvider.getInstance();
        NoteDAO noteDAO = daoProvider.getNoteDAO();
        List<Note> x;
        x = noteDAO.findWordInMessageAndSortByTopic(word);
        x.sort(compareByTopic);

        if (x.size()>0) {
            for (Note temp : x) {
                System.out.println(temp);
            }
        }else System.out.println("Заметок не надено.");

    }
}
