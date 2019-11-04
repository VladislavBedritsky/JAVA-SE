package modul_5.basicsOfOOP.task_1.main;

import modul_5.basicsOfOOP.task_1.entity.Directory;
import modul_5.basicsOfOOP.task_1.entity.TextFile;

/*
Задача 1.
Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
вывести на консоль содержимое, дополнить, удалить.
 */
public class Main {
    public static void main(String[] args) {

        String s1 = "Вселе́нная — не имеющее строгого определения понятие в астрономии и философии.\n";
        String s2 = "Оно делится на две принципиально отличающиеся сущности: умозрительную (философскую) и материальную, доступную наблюдениям в настоящее время или в обозримом будущем.\n";

        Directory directory = new Directory("Wiki");
        TextFile textFile = new TextFile(directory,"Space\n");
        textFile.changeName("Universe\n");
        textFile.addText(textFile.getName());
        textFile.addText(s1);
        textFile.addText(s2);
        textFile.print();


    }
}
