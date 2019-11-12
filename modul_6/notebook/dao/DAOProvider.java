package by.htp.notebook.dao;

import by.htp.notebook.dao.impl.FileNoteDAO;

public class DAOProvider {

    private static final DAOProvider instance = new DAOProvider();

    private NoteDAO noteDAO = new FileNoteDAO();

    private DAOProvider(){}

    public static DAOProvider getInstance() {
        return instance;
    }

    public NoteDAO getNoteDAO() {
        return noteDAO;
    }

    public void setNoteDAO(NoteDAO noteDAO) {
        this.noteDAO = noteDAO;
    }
}
