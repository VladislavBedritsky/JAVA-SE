package modul_3.stringBuilder;

public class Task_6 {
    public static void main(String[] args) {

        String str = "информатика the best";
        System.out.println(str);
        System.out.println(result(str));
    }
    private static String result (String str) {

        StringBuilder sbdr = new StringBuilder();
        for (int i = 0; i < str.length();i++) {
            if (str.charAt(i) != ' ') {
                sbdr.append(str.charAt(i));
                sbdr.append(str.charAt(i));
            } else sbdr.append(str.charAt(i));
        }
        return sbdr.toString();
    }
}
