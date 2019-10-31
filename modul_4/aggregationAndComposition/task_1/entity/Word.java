package modul_4.aggregationAndComposition.task_1.entity;

public class Word {

    private String word;

    public Word (String word) {
        this.word = word;
    }

    public void setWord () {
        this.word = word;
    }
    public String getWord () {
        return word;
    }
    @Override
    public boolean equals (Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Word other = (Word) obj;
        return word.equals(other.word);

    }
    @Override
    public int hashCode () {
        int result = 1;
        result = 31*result + (word == null ? 0 : word.hashCode());
        return result;
    }
    @Override
    public String toString() {
        return  word ;
    }
}
