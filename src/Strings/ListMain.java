package Strings;


import java.util.ArrayList;
import java.util.List;

public class ListMain {

    public static void main(String[] args) {
        List<String> nameList = new ArrayList<String>();

        nameList.add("name1");
        nameList.add("name2");
        nameList.add("name3");
        nameList.add("name4");
        nameList.add("name5");

        System.out.println(nameList);

        for (String names : nameList) {
            System.out.println(names);
        }

        List<Coche> coches = new ArrayList<>();

        coches.add(new Coche("lolo"));
        coches.add(new Coche("Honda"));
        coches.add(new Coche("Gts"));
        coches.add(new Coche("Cavalier"));

        System.out.println(coches);

        for (Coche coche : coches) {
            System.out.println(coche);
        }

    }
}
