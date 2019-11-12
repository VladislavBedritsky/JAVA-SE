package by.htp.notebook.dao.impl;

import by.htp.notebook.dao.NoteDAO;
import by.htp.notebook.entity.Note;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileNoteDAO implements NoteDAO {

    @Override
    public Note add(String topic, String date, String email, String message) {

        String s;
        int q = 0;
        Pattern pattern = Pattern.compile("^((\\w|[-+])+(\\.[\\w-]+)*@[\\w-]+((\\.[\\d\\p{Alpha}]+)*(\\.\\p{Alpha}[2,])*)*)$");
        Matcher matcher = pattern.matcher(email);

        if (matcher.find()) {
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/by/htp/notebook/source/notepad.txt",true));
                String reg = "-@- ";
                bufferedWriter.write("\n"+topic+reg+date+reg+email+reg+message);
                bufferedWriter.close();
            }catch (IOException e) {
                System.out.println("File not found");
            }
        }else System.out.println("Некорректный почтовый адрес.");

        Note note = new Note(topic);

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/by/htp/notebook/source/notepad.txt"));
            while ((s = bufferedReader.readLine())!=null) {
                String[] params = s.split("-@- ");
                if(topic.equals(params[0])&&date.equals(params[1])&&email.equals(params[2])&&message.equals(params[3])) {
                    return note;
                }
            }
            bufferedReader.close();
        }catch (IOException e) {
            System.out.println("File not found");
        }
        return null;
    }

    @Override
    public Note remove(String topic) {


        String s;
        StringBuilder stringBuilder = new StringBuilder();
        int q = 0;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/by/htp/notebook/source/notepad.txt"));
            while ((s = bufferedReader.readLine())!=null) {
                String[] params = s.split("-@- ");
                if (topic.equalsIgnoreCase(params[0])){
                    q++;
                    continue;
                }
                stringBuilder.append(s).append("\n");
            }
            bufferedReader.close();
        }catch (IOException e) {
            System.out.println("File not found");
        }

        stringBuilder.delete(stringBuilder.length()-1,stringBuilder.length());

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/by/htp/notebook/source/notepad.txt"));
            bufferedWriter.write(stringBuilder.toString());
            bufferedWriter.close();
        }catch (IOException e) {
            System.out.println("Файл не найден");
        }

        if (q != 0) {
            return new Note(topic);
        }
        return null;
    }

    @Override
    public void display() {
        String s ;
        int i = 0;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/by/htp/notebook/source/notepad.txt"));
            while ((s = bufferedReader.readLine()) != null) {
                String[]params = s.split("-@- ");

                i++;
                System.out.println(i +"."+params[0]+'('+params[1]+") "+"- "+ params[2]+":"+"\n");
                System.out.println(params[3]+"\n______________");
            }
            bufferedReader.close();
        }catch (IOException e) {
            System.out.println("Файл не найден.");
        }
    }

    @Override
    public List<Note> findWordInMessageAndSortByTopic(String word) {

        String s;
        List<Note> notes = new ArrayList<>();
        int q = 0;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/by/htp/notebook/source/notepad.txt"));
            while ((s = bufferedReader.readLine()) != null) {
                String[]params = s.split("-@- ");
                String[]params1 = params[3].split("\\s+");
                for (String temp : params1) {
                    if (temp.equalsIgnoreCase(word)){
                        notes.add(new Note(params[0],params[1],params[2],params[3]));
                    }
                }
            }
            bufferedReader.close();
        }catch (IOException e) {
            System.out.println("Файл не найден.");
        }
        return notes;
    }
}
