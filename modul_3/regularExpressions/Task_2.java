package modul_3.regularExpressions;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_2 {
    public static void main(String[] args) {

        String str = "<notes>\n" +
                "    <note id = \"1\">\n" +
                "        <to>Вася</to>\n" +
                "        <from>Света</from>\n" +
                "        <heading>Напоминание</heading>\n" +
                "        <body>Позвони мне завтра!</body>\n" +
                "    </note>\n" +
                "    <note id = \"2\">\n" +
                "        <to>Петя</to>\n" +
                "        <from>Маша</from>\n" +
                "        <heading>Важное напоминание</heading>\n" +
                "        <body/>\n" +
                "    </note>\n" +
                " </notes> ";
        System.out.println(result(str));
    }

    private static String result (String str) {

        StringBuilder sbdr = new StringBuilder();
        Pattern ptrOpen = Pattern.compile("<\\w.+?>");
        Pattern ptrClose = Pattern.compile("</+[\\w]*>");
        Pattern ptrAlone = Pattern.compile("<[\\w]*/+>");
        Pattern ptrText = Pattern.compile(">.+<");

        String[] xml = str.split("\\n");
        for (String temp : xml) {
            Matcher mtrOpen = ptrOpen.matcher(temp);
            Matcher mtrClose = ptrClose.matcher(temp);
            Matcher mtrAlone = ptrAlone.matcher(temp);
            Matcher mtrText = ptrText.matcher(temp);

            if (mtrAlone.find()) {
                sbdr.append(mtrAlone.group());
                sbdr.append(" - тег без тела\n");
            }
            if (mtrOpen.find()) {
                sbdr.append(mtrOpen.group());
                sbdr.append(" - открывающий тег\n");
            }
            if (mtrText.find()) {
                sbdr.append(mtrText.group());
                sbdr.append(" - содержимое тега\n");
            }
            if (mtrClose.find()) {
                sbdr.append(mtrClose.group());
                sbdr.append(" - закрывающий тег\n");
            }
        }
        return sbdr.toString();
    }

}
