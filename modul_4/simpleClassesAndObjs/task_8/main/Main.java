package modul_4.simpleClassesAndObjs.task_8.main;

import modul_4.simpleClassesAndObjs.task_8.print.Print;
import modul_4.simpleClassesAndObjs.task_8.entity.Customer;
import modul_4.simpleClassesAndObjs.task_8.entity.Info;
import modul_4.simpleClassesAndObjs.task_8.logic.InfoLogic;
import modul_4.simpleClassesAndObjs.task_8.logic.OutputByName;

import java.math.BigInteger;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Info info = new Info();

        info.add(new Customer(3124,"Korobeynikov A.V.","Osipenko str. 38", new BigInteger("3452278960440767"),"2343002234225534"));
        info.add(new Customer(3,"Gavrichenko P.I.","Masherova str. 132/3", new BigInteger("8745999345546012"),"3452238960433"));
        info.add(new Customer(8737,"Babich K.O.","Skorina str. 12", new BigInteger("3299447785584954") ,"34522689904412"));
        info.add(new Customer(153,"Dobrush E.P.","Moskovskaya str. 348/7", new BigInteger("0003422457438881"),"3451278930465"));
        info.add(new Customer(23,"Golenko R.A.","Gogolia str. 79", new BigInteger("7432441954920077"),"3454275960489"));
        info.add(new Customer(97,"Soroka A.M.","Skazochnaia str. 9", new BigInteger("4812429450255553"),"34522744360486"));
        info.add(new Customer(5689,"Makarevich E.M.","Fruktovaia str. 32", new BigInteger("4242555193300041"),"3452273960333"));
        info.add(new Customer(459,"Petrov N.M.","Osipenko str. 77", new BigInteger("9001543199304331"),"3411278960767"));

        OutputByName outputByName = new OutputByName();        //вывод в алфавитном порядке
        InfoLogic in = new InfoLogic(outputByName);
        List<Customer> sortedByNameResult = in.sortByName(info);
        Print.printByName(sortedByNameResult);

        System.out.println("___________________");

        List<Customer> credit = in.takeCreditCard(info);        // вывод по банковской карте
        Print.cardholder(credit);
    }
}
