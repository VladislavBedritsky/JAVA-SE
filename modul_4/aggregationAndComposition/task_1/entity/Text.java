package modul_4.aggregationAndComposition.task_1.entity;

import java.util.ArrayList;
import java.util.List;

public class Text {

    private Word headline;
    private List<Sentence> sentences;

    public Text (Word headline, Sentence sentence) {
        sentences = new ArrayList<>();
        this.headline = headline;
    }

    public Text (List<Sentence> sentences ) {
        this.sentences = sentences;
    }

    public void add (Sentence temp) {
        sentences.add(temp);
    }
    public void print () {
        for (Sentence temp : sentences) {
            System.out.println(temp);
        }
    }
    public void printHL (){
        System.out.println(headline);
    }

    public void setHeadline (Word headline){
        this.headline = headline;
    }
    public void setSentences(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    public Word getHeadline () {
        return headline;
    }
    public List<Sentence> getSentences () {
        return sentences;
    }

    @Override
    public boolean equals (Object obj) {
        if (this == obj) return  true;
        if (obj == null || getClass() != obj.getClass()) return  false;
        Text other = (Text) obj;
        return headline.equals(other.headline) &&
                sentences.equals(other.sentences);
    }
    @Override
    public int hashCode () {
        int result = 1;
        result = 31*result + (headline == null ? 0 : headline.hashCode());
        for (Sentence temp : sentences) {
            result = 31*result + (temp == null ? 0 : temp.hashCode());
        }
        return result;
    }
}
