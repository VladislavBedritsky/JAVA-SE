package modul_4.simpleClassesAndObjs.task_10.main;

import modul_4.simpleClassesAndObjs.task_10.entity.AirLine;
import modul_4.simpleClassesAndObjs.task_10.logic.AirlineLogic;
import modul_4.simpleClassesAndObjs.task_10.entity.Info;
import modul_4.simpleClassesAndObjs.task_10.print.Print;

import java.text.ParseException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException {

    Info info = new Info();

    info.add(new AirLine("Los Angeles", 347,"Boeing747",AirLine.sTime.parse("12:45"), new String[]{"monday","wednesday"}));
    info.add(new AirLine("New York", 113,"Boeing 737MAX",AirLine.sTime.parse("00:15"), new String[]{"monday","wednesday","saturday"}));
    info.add(new AirLine("Paris", 651,"Airbus A330neo",AirLine.sTime.parse("15:05"), new String[]{"wednesday","sunday"}));
    info.add(new AirLine("London", 75,"Boeing747",AirLine.sTime.parse("17:45"), new String[]{"tuesday","thursday","sunday"}));
    info.add(new AirLine("Pekin", 323,"Boeing 777X",AirLine.sTime.parse("19:00"), new String[]{"monday","wednesday","friday"}));
    info.add(new AirLine("Moscow", 67,"Airbus A320",AirLine.sTime.parse("21:25"), new String[]{"saturday","sunday"}));
    info.add(new AirLine("Tokiyo", 802,"Boeing747",AirLine.sTime.parse("23:30"), new String[]{"monday","wednesday"}));
    info.add(new AirLine("Rome", 224,"Airbus A320",AirLine.sTime.parse("11:20"), new String[]{"friday"}));

        AirlineLogic airlineLogic = new AirlineLogic();
        List<AirLine> destination = airlineLogic.outputByDest(info);
        Print.printByDest(destination);
        System.out.println("__________________________");

        List<AirLine> day = airlineLogic.outputByDay(info);
        Print.printByDay(day);
        System.out.println("__________________________");

        List<AirLine> time = airlineLogic.outputByTime(info);
        Print.printByTime(time);

    }
}
