package modul_5.basicsOfOOP.task_1.entity;

import java.util.Objects;

public class TextFile extends File {

    private Text content;

    public TextFile (Directory directory, String name) {
        super(directory,name);
        content = new Text("");
    }

    @Override
    public void changeName(String name) {
        this.setName(name);
    }

    public void addText (String text) {
        content.addText(text);
    }

    public void print () {
        System.out.println(content.getText());
    }

    public void setContent (Text content) {
        this.content = content;
    }
    public Text getContent () {
        return content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TextFile textFile = (TextFile) o;
        return content.equals(textFile.content);
    }
    @Override
    public int hashCode() {
        return Objects.hash(content);
    }
    @Override
    public String toString() {
        return "TextFile{" +
                "content=" + content +
                '}';
    }
}
