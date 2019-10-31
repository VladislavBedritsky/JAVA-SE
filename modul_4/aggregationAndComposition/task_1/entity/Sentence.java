package modul_4.aggregationAndComposition.task_1.entity;
/*
1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
консоль текст, заголовок текста.

 */
public class Sentence {

    private String sentence;

    public Sentence(String sentence) {
        this.sentence = sentence;
    }

    public void setSentence () {
        this.sentence = sentence;
    }
    public String getSentence () {
        return sentence;
    }
    @Override
    public boolean equals (Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Sentence other = (Sentence) obj;
        return sentence.equals(other.sentence);

    }
    @Override
    public int hashCode () {
        int result = 1;
        result = 31*result + (sentence == null ? 0 : sentence.hashCode());
        return result;
    }
    @Override
    public String toString() {
        return sentence ;
    }
}
