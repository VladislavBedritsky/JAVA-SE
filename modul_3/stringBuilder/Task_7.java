package modul_3.stringBuilder;

public class Task_7 {
    public static void main(String[] args) {

        String str = "abc cde def fde edk";
        System.out.println(str);
        System.out.println(result(str));
    }
    private static String result (String str) {

        StringBuilder sbdr = new StringBuilder(str);
        for (int i = 0; i < sbdr.length();i++) {
          char ch = sbdr.charAt(i);

          if (ch == ' ') {
              sbdr.deleteCharAt(i);
              i--;
              continue;
          }

          for (int j = i + 1; j < sbdr.length();j++) {
              if (ch == sbdr.charAt(j)) {
                  sbdr.deleteCharAt(j);
              }
          }
        }

        return sbdr.toString();
    }
}
