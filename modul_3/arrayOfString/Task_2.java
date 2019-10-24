package modul_3.arrayOfString;

public class Task_2 {
    public static void main(String[] args) {

        String word = "word of words";
        System.out.println(word);
        System.out.println(result(word));

    }
    private static String result (String word) {
        String letter;
        StringBuilder sBlr =new StringBuilder();
        for (int i = 0;i < word.length();i++) {
            if (i+3 < word.length() && word.charAt(i) == 'w' && word.charAt(i+1) == 'o' && word.charAt(i+2) == 'r' && word.charAt(i+3) == 'd') {
                sBlr.append("letter");
                i+=3;
            } else {
                sBlr.append(word.charAt(i));
            }
        }
        letter = sBlr.toString();
        return letter;
    }
}
