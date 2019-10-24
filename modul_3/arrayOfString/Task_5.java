package modul_3.arrayOfString;

public class Task_5 {
    public static void main(String[] args) {
        String str = "   What       an    amazing   world    !   ";
        System.out.println(str);
        System.out.println(result(str));
    }
    private static String result (String str) {
        StringBuilder sblr = new StringBuilder();
        String res = str.trim();
        boolean bln = false;
        for (int i = 0; i < str.length();i++) {
            if (str.charAt(i) == ' ') {
                if (!bln) {
                    sblr.append(" ");
                }
                bln = true;
            } else {
                sblr.append(str.charAt(i));
                bln = false;
            }
        }
        res = sblr.toString();

        return res;
    }
}
