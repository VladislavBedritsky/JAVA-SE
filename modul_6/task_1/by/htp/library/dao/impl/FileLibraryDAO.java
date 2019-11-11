package by.htp.library.dao.impl;

import by.htp.library.dao.LibraryDAO;
import by.htp.library.entity.Book;
import by.htp.library.entity.TypeOfBook;

import java.io.*;

public class FileLibraryDAO implements LibraryDAO {

    @Override
    public Book add(String title, TypeOfBook typeOfBook) {

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/by/htp/library/source/books.txt",true));

            bufferedWriter.write("\n"+title);
            bufferedWriter.write("@");
            bufferedWriter.write(typeOfBook.toString().toLowerCase());

            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Файл не найден");
        }

        Book book = new Book();
        String s;

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/by/htp/library/source/books.txt"));
            while ((s = bufferedReader.readLine()) != null ) {
                String[] params = s.split("@");
                if (title.equals(params[0]) && typeOfBook.toString().toLowerCase().equals(params[1])) {
                    return book;
                }
            }
            bufferedReader.close();
        }catch (IOException e){
            System.out.println("файл не найден");
        }

    return null;
    }

    @Override
    public Book remove(String title,TypeOfBook typeOfBook) {

        StringBuilder str = new StringBuilder();
        String s;
        Book book = new Book();
        int q = 0;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/by/htp/library/source/books.txt"));
            while ((s = bufferedReader.readLine()) != null) {
                String[] params = s.split("@");
                if (title.equalsIgnoreCase(params[0]) && typeOfBook.toString().toLowerCase().equals(params[1])) {
                    q++;
                    continue;
                }
                str.append(s).append("\n");
            }
            bufferedReader.close();
        }catch (IOException e) {
            System.out.println("Файл не найден");
        }

        str.delete(str.length()-1,str.length());

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/by/htp/library/source/books.txt"));
            bufferedWriter.write(str.toString());
            bufferedWriter.close();
        }catch (IOException e) {
            System.out.println("Файл не найден");
        }
        if (q != 0) {
            return book;
        }

    return null;
    }

    @Override
    public void display() {

        String s;

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/by/htp/library/source/books.txt"));
            while ((s = bufferedReader.readLine()) != null) {
                String[] params = s.split("@");
                System.out.println(params[0]+" - "+params[1]);
            }
            bufferedReader.close();
        }catch (IOException e) {
            System.out.println("Файл не найден");
        }
    }

    @Override
    public void findByTitle(String title) {

        String s;
        int q = 0;

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/by/htp/library/source/books.txt"));
            while ((s = bufferedReader.readLine()) != null) {
                String[] params = s.split("@");
                if (params[0].equalsIgnoreCase(title)) {
                    System.out.println(params[0]+" - "+params[1]);
                    q++;
                }
            }
            bufferedReader.close();
        }catch (IOException e) {
            System.out.println("Файл не найден.");
        }
        if (q == 0) {
            System.out.println("Такой книги в списке нет.");
        }

    }

    @Override
    public void findByType(TypeOfBook typeOfBook) {

        String s;

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/by/htp/library/source/books.txt"));
            while ((s = bufferedReader.readLine()) != null) {
                String[] params = s.split("@");
                if (params[1].equalsIgnoreCase(typeOfBook.toString())) {
                    System.out.println(params[0]+" - "+params[1]);
                }
            }
            bufferedReader.close();
        }catch (IOException e) {
            System.out.println("Файл не найден.");
        }
    }
}
