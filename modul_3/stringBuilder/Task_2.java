package modul_3.stringBuilder;

public class Task_2 {
    public static void main(String[] args) {

        String str = "Pancakes are tasty";
        System.out.println(str);
        System.out.println(result(str));
    }

    private static String result (String str) {

        StringBuilder sbldr = new StringBuilder();
        for (int i = 0;i < str.length();i++) {
            sbldr.append(str.charAt(i));
            if (str.charAt(i) == 'a') {
                sbldr.append("b");
            }
        }
        return sbldr.toString();
    }
}
