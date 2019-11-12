package by.htp.notebook.entity;

import java.util.Objects;

public class Note {

    private String topic;
    private String date;
    private String email;
    private String message;

    public Note(String topic,String date,String email, String message){
        this.topic = topic;
        this.date = date;
        this.email = email;
        this.message = message;
    }

    public Note(String topic){
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note note = (Note) o;
        return topic.equals(note.topic) &&
                date.equals(note.date) &&
                email.equals(note.email) &&
                message.equals(note.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic, date, email, message);
    }

    @Override
    public String toString() {
        return topic+"("+date+")"+" - "+email+":\n"+message+"\n___________";
    }
}
