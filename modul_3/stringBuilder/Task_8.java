package modul_3.stringBuilder;

public class Task_8 {
    public static void main(String[] args) {

        String str = "What an amazing world";
        System.out.println(str);
        System.out.println(result(str));
    }

    private static String result(String str) {
        int lenght = 0;
        String word = "";
        for (String tmp : str.split(" ")) {
            if (lenght < tmp.length()) {
                lenght = tmp.length();
                word = tmp;
            }
        }
        return word;
    }
}