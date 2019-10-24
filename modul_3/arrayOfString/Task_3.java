package modul_3.arrayOfString;

public class Task_3 {
    public static void main(String[] args) {

        String digits = "1 plus 3 isn't equally 452";
        System.out.println(digits);
        System.out.println("Количество цифр = "+amount(digits));

    }
    private static int amount (String digits) {
        int k = 0;
        char[] digs = {'1','2','3','4','5','6','7','8','9','0'};
        for (int i = 0; i < digits.length();i ++) {
            for(int tmp : digs) {
                if (digits.charAt(i) == tmp) {
                    k++;
                }
            }
        }
        return k;
    }
}
