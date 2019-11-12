package by.htp.notebook.dao;

import by.htp.notebook.entity.Note;

import java.util.List;

public interface NoteDAO {

    Note add (String topic, String date, String email, String message);

    Note remove (String topic);

    void display();

    List<Note> findWordInMessageAndSortByTopic(String word);


}
