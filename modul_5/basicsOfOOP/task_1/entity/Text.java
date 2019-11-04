package modul_5.basicsOfOOP.task_1.entity;

public class Text {

    private String text;

    public Text (String text) {
        this.text = text;
    }

    public void addText (String text) {
        StringBuilder stringBuilder = new StringBuilder(this.text);
        this.text = stringBuilder.append(text).toString();
    }

    public void setText (String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }

    @Override
    public boolean equals (Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Text other = (Text) obj;
        return text.equals(other.text);
    }
    @Override
    public int hashCode () {
        int result = 1;
        result = result*31 + (text == null ? 0 : text.hashCode());
        return result;
    }
    public String toString() {
        return text;
    }
}
