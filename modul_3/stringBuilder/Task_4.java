package modul_3.stringBuilder;

public class Task_4 {
    public static void main(String[] args) {

        String str = "информатика";
        System.out.println(ch(str));
        System.out.println(result(str));

    }
    private static char[] ch (String str) {
        char[] arrOfchar = new char[str.length()];
        str.getChars(0,str.length(),arrOfchar,0);
        return arrOfchar;
    }
    private static String result (String str) {
         String s1 = String.copyValueOf(ch(str),7,1);
         String s2 = String.copyValueOf(ch(str),3,2);
         String s = "";
         s = s.concat(s1);
         s = s.concat(s2);
         s = s.concat(s1);
         return s;
    }
}
