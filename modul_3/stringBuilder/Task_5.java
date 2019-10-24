package modul_3.stringBuilder;

public class Task_5 {
    public static void main(String[] args) {
        String str = "Pancakes are tasty And sweet";
        System.out.println(str);
        System.out.println(result(str));
    }

    private static int result (String str) {
        str = str.toLowerCase();
        int k = 0;
        for (int i = 0;i < str.length();i++) {
            if (str.charAt(i) == 'a') {
                k++;
            }
        }
        return k;
    }
}
