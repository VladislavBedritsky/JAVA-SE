package modul_3.stringBuilder;

public class Task_3 {
    public static void main(String[] args) {

        String str = "А к долу лодка";  // Арбуз влетел в зубра   / /А щётка как тёща
        System.out.println(str);
        if (!palindrom(str)) {
            System.out.println("Строка не явл-ся палиндромом");
        } else System.out.println("Это палиндром");
    }
    private static String result (String str) {

        StringBuilder sbdr = new StringBuilder();
        for (int i = 0; i < str.length();i++) {
            if (str.charAt(i) != ' ') {
                sbdr.append(str.charAt(i));
            }
        }
        String s = sbdr.toString();
        s = s.toLowerCase();
        return s;
    }
    private static boolean palindrom (String str) {

        for (int i = 0; i < result(str).length()/2;i++) {
            if(result(str).charAt(i) != result(str).charAt(result(str).length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
