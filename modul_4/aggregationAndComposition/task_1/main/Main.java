package modul_4.aggregationAndComposition.task_1.main;

import modul_4.aggregationAndComposition.task_1.entity.Sentence;
import modul_4.aggregationAndComposition.task_1.entity.Text;
import modul_4.aggregationAndComposition.task_1.entity.Word;

public class Main {
    public static void main(String[] args) {

        Word headline = new Word("Письмо Онегина к Татьяне");

        String s1 = " Предвижу всё: вас оскорбит\n" +
                "Печальной тайны объясненье.\n" +
                "Какое горькое презренье\n" +
                "Ваш гордый взгляд изобразит!\n" +
                "Чего хочу? с какою целью\n" +
                "Открою душу вам свою?\n" +
                "Какому злобному веселью,\n" +
                "Быть может, повод подаю!";

        Sentence sentence = new Sentence(s1);
        Text text = new Text(headline, sentence);

        String s2 = "  Случайно вас когда-то встретя,\n" +
                "В вас искру нежности заметя,\n" +
                "Я ей поверить не посмел:\n" +
                "Привычке милой не дал ходу;\n" +
                "Свою постылую свободу\n" +
                "Я потерять не захотел.\n" +
                "Ещё одно нас разлучило...";

        String s3 = "Несчастной жертвой Ленской пал...\n" +
                "Ото всего, что сердцу мило,\n" +
                "Тогда я сердце оторвал;\n" +
                "Чужой для всех, ничем не связан,\n" +
                "Я думал: вольность и покой\n" +
                "Замена счастью. Боже мой!\n" +
                "Как я ошибся, как наказан!";

        text.add(new Sentence(s1));
        text.add(new Sentence(s2));
        text.add(new Sentence(s1));

        text.printHL();
        System.out.println("___________");
        text.print();


    }
}
