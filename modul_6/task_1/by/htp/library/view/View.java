package by.htp.library.view;

import by.htp.library.controller.Controller;
import by.htp.library.entity.TypeOfBook;

import javax.mail.MessagingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class View {

    private Controller controller = new Controller();

    public void askTypeOfUser () throws MessagingException {

        Scanner scr = new Scanner(System.in);

        String s;
        int q = 0;

        do {
            System.out.println("Вы хотите войти как администратор(admin) или пользователь(user)?");
            s = scr.nextLine();
            if (s.equalsIgnoreCase("admin")) {
                q++;
            } else if (s.equalsIgnoreCase("user")) {
                q++;
            } else if (s.equalsIgnoreCase("exit")) {
                System.exit(0);
            } else System.out.println("admin/user/exit");

        } while (q == 0);

        String login;
        String password;

        System.out.println("Введите логин:");
        login = scr.nextLine();
        System.out.println("Введите пароль:");
        password = scr.nextLine();

        String req = "logination login="+login+" password="+md5Custom(password)+" "+s;
        String response = controller.doActionUser(req);
        System.out.println(response);

        if (response.contains("Hello")) {
            switch (s) {
                case "admin":
                    adminFunctional();
                    break;
                case "user":
                    userFunctional();
                    break;
            }
        }
    }

    private void adminFunctional() throws MessagingException {
        System.out.println("Операции, которые вы можете делать:" +
                "\n1.Добавить книгу." +
                "\n2.Удалить книгу." +
                "\n3.Вывести список книг."+
                "\n4.Найти книгу по названию."+
                "\n5.Найти книгу по типу.");
        System.out.println("Введите номер команды:");
        Scanner scr = new Scanner(System.in);
        int q = scr.nextInt();
        switch (q) {
            case 1:
                String s = nameOfBook();
                String add = controller.doActionToAddBook(s+"@"+typeOfBook());
                System.out.println(add);
                if (!add.contains("не")) {
                    controller.sendMaleToUserAboutNewBook(s);
                }
                break;
            case 2:
                String remove = controller.doActionToRemoveBook(nameOfBook()+"@"+typeOfBook());
                System.out.println(remove);
                break;
            case 3:
                controller.doActionToDisplayBooks();
                break;
            case 4:
                controller.doActionToFindBookByTitle(nameOfBook());
                break;
            case 5:
                controller.doActionToFindBookByType(TypeOfBook.valueOf(typeOfBook()));
        }
    }

    private void userFunctional() throws MessagingException {
        System.out.println("Операции, которые вы можете делать:" +
                "\n1.Вывести список книг."+
                "\n2.Найти книгу по названию."+
                "\n3.Найти книгу по типу."+
                "\n4.Предложить админу добавить книгу.");

        System.out.println("Введите номер команды:");
        Scanner scr = new Scanner(System.in);
        int q = scr.nextInt();
        switch (q) {
            case 1:
                controller.doActionToDisplayBooks();
                break;
            case 2:
                controller.doActionToFindBookByTitle(nameOfBook());
                break;
            case 3:
                controller.doActionToFindBookByType(TypeOfBook.valueOf(typeOfBook()));
            case 4:
                controller.sendMaleToAdmin(nameOfBook(),userEmail(),userPassword());
                break;
        }
    }

    private String nameOfBook() {
        System.out.println("Введите название книги:");
        Scanner scr = new Scanner(System.in);
        return scr.nextLine();
    }

    private String typeOfBook() {
        System.out.println("Выберите тип книги:");
        Scanner scr = new Scanner(System.in);

        do {
            String s = scr.nextLine();
            if(s.equalsIgnoreCase(TypeOfBook.DIGITAL.toString().toLowerCase())) {
                return TypeOfBook.DIGITAL.toString();
            }else if (s.equalsIgnoreCase(TypeOfBook.PAPER.toString().toLowerCase())) {
                return TypeOfBook.PAPER.toString();
            }else System.out.println("digital/paper");
        }while (true);

    }

    private String md5Custom(String string) {     // шифрование пароля md5

        MessageDigest messageDigest = null;
        byte[] digest = new byte[0];

        try {
            messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(string.getBytes());
            digest = messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        BigInteger bigInt = new BigInteger(1, digest);
        String md5Hex = bigInt.toString(16);

        while( md5Hex.length() < 32 ){
            md5Hex = "0" + md5Hex;
        }

        return md5Hex;
    }

    private String userEmail(){
        Scanner scr = new Scanner(System.in);
        int q = 0;

        System.out.println("Введите ваш почтовый адрес.");
        String s = scr.nextLine();
        Pattern pattern = Pattern.compile("^((\\w|[-+])+(\\.[\\w-]+)*@[\\w-]+((\\.[\\d\\p{Alpha}]+)*(\\.\\p{Alpha}[2,])*)*)$");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
           q++;
        }
        if (q != 0) {
            return s;
        }else {
            System.out.println("Некорректный почтовый адрес.");
            System.exit(0);
        }
       return null;
    }

    private String userPassword() {

        Scanner scr = new Scanner(System.in);
        int q = 0;
        String s;
        System.out.println("Введите пароль от почтового ящика.");
        s = scr.nextLine();
        return s;
    }
}
