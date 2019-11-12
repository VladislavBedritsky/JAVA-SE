package by.htp.notebook.service.impl;

import by.htp.notebook.entity.Note;

import java.util.Comparator;

public class CompareByTopic implements Comparator<Note> {
    @Override
    public int compare(Note o1, Note o2) {
        int result;
        result = o1.getTopic().compareTo(o2.getTopic());
        if (result != 0) {
            return result;
        }
        return result;
    }
}
