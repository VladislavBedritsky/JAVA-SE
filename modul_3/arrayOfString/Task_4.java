package modul_3.arrayOfString;

public class Task_4 {
    public static void main(String[] args) {

        String numb = "1 plus 3 isn't equally 452";
        System.out.println(numb);
        System.out.println("Количество чисел = "+amount(numb));

    }
    private static boolean bln (char ch) {
        boolean bln = false;
        char[] digs = {'1','2','3','4','5','6','7','8','9','0'};
        for (char tmp : digs) {
            if (ch == tmp) {
                bln = true;
            }
        }

        return bln;
    }
    private static int amount (String numb) {
        int k = 0;
        for (int i = 0;i < numb.length();i++) {
            if(bln(numb.charAt(i))) {
                if (i == numb.length() - 1 || !bln(numb.charAt(i+1)) ) {
                    k++;
                }
            }
        }
        return k;
    }

}
