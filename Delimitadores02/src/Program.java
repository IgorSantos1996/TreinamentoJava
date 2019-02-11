import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        /* Primeiro exemplo
        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(5);

        List<? extends Number> list = intList;

        Number x = list.get(0);*/
        // erro list.add(0);

        List<Object> myObjs = new ArrayList<>();
        myObjs.add("Maria");
        myObjs.add("Alex");
        List<? super Number> myNums = myObjs; // myNums aceita qualquer tipo Number ou super de Number
        myNums.add(10);
        myNums.add(3.14);
        //erro Number x = myNums.get(0);
    }
}
