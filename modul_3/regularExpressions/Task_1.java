package modul_3.regularExpressions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Task_1 {
    public static void main(String[] args) throws IOException {

        String str = "Java.util.regex.Pattern. \n" +
                "Do something special for you. Hello guys! Good evening.\n" +
                "Thanks man. Are you sure you don't want to?\n" +
                "Ok. It's fare enough.\n" +
                "Brest - is city...\n" +
                "Pattern p3 = Pattern.compile.";
        util(str);
    }

    private static String[] splitParagraph (String x) {                 // Разделение текста на абзацы
        return  x.split("\n");
    }

    private static String[] splitSentence  (String x) {                 // Разделение абзацев на строки
        Pattern ptr = Pattern.compile("[.!?][\\s]+");
        return ptr.split(x);
    }

    private static String[] splitWord (String x) {                      // Разделение строк на слова
        Pattern ptr = Pattern.compile("[\\s]*[.,:;!?\\s]+[\\s]*");
        return ptr.split(x);
    }
    private static String[] splitLexemes (String x) {                      // Разделение на символы
        Pattern ptr = Pattern.compile("[\\s]*[.,:;!?]*[\\s]*");
        return ptr.split(x);
    }

    private static void paragraphs (String str) {                        // Сортировка по количеству строк в абзацах
        int[] amountSentInParf = new int[splitParagraph(str).length];
        int maxAmount = 0;
        for (int i = 0; i < splitParagraph(str).length;i++) {
            String[] sent = splitSentence(splitParagraph(str)[i]);
            amountSentInParf[i] = sent.length;
            if (maxAmount < sent.length) {
                maxAmount = sent.length;
            }
        }

        for(int i = maxAmount; i > 0;i--) {
            for (int j = 0; j < amountSentInParf.length;j ++) {
                if (i == amountSentInParf[j]) {
                    System.out.println(splitParagraph(str)[j]);
                }
            }
        }
        System.out.println("---------------------------");
    }

    private static void sentences (String str) {                     // Сортировка по количеству слов в строках

        int[] amountWordsInSents = new int[splitSentence(str).length];
        int maxAmount = 0;
        for (int i = 0; i < splitSentence(str).length; i++) {
            String[] word = splitWord(splitSentence(str)[i]);
            amountWordsInSents[i] = word.length;
            if(maxAmount < word.length) {
                maxAmount = word.length;
            }
        }
        for (int i = maxAmount;i > 0;i--) {
            for (int j = 0; j < amountWordsInSents.length;j++) {
                if (i == amountWordsInSents[j]) {
                    System.out.println(splitSentence(str)[j]);
                }
            }
        }
        System.out.println("---------------------------");
    }
    private static void words (String str) {                         // количество символов в в словах

        int[] amountLexInWords = new int[arrayWord(str).length];
        int maxAmount = 0;
        for (int i = 0; i < arrayWord(str).length;i++) {
            String[] lexemes = splitLexemes(arrayWord(str)[i]);
            amountLexInWords[i] = lexemes.length;
            if (maxAmount < lexemes.length) {
                maxAmount = lexemes.length;
            }
        }

        for(int i = maxAmount;i > 0;i--) {
            for(int j = 0; j < amountLexInWords.length;j++) {
                if (i == amountLexInWords[j]) {
                   System.out.println(arrayWord(str)[j]);
                }
            }
        }
        System.out.println("---------------------------");


    }
    private static String[] arrayWord (String str) {                     // создание клона массива слов для сортировки в алфавитном порядке

        String[] array = splitWord(str).clone();
        for (int i = 0;i < array.length ;i++){
            for (int j = i + 1;j < array.length;j++) {
                if (array[j].compareToIgnoreCase(array[i]) < 0) {
                    String tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }
        return array;
    }
    private static void util (String str) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 1, если хотите отсортировать в тексте абзацы по количеству строк\n" +
                "Введите 2, если хотите отсортировать в тексте строки по количеству слов\n" +
                "Введите 3, если хотите отсортировать в тексте лексемы по количеству символов\n" +
                "Введите Ok, если всё и так Ok !");
        String s = "";
        while(!s.equalsIgnoreCase("ok")) {
            System.out.print("Введите команду: ");
            s = reader.readLine();
            switch (s) {
                case "1": paragraphs(str);
                    break;
                case "2": sentences(str);
                    break;
                case "3": words(str);
                    break;
                case "ok":
                    System.out.println("\nIt's over. Thanks for using. Good luck =) ");
                    break;
                default:
                    System.out.println("Oops! Something go wrong! Try it again!\n");
            }
        }
    }
}
