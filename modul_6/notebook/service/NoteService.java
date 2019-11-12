package by.htp.notebook.service;

import by.htp.notebook.entity.Note;

public interface NoteService {

    void display();

    Note add (String topic, String date, String email, String message);

    Note remove (String topic);

    void findWordInMessageAndSortByTopic(String word);
}
