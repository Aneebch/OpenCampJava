package ObjectClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListPerson {

    public static void main(String[] args) {

        Persons alex = new Persons("Alex", "Muñoz", "velasco", "12.345.678-l", 25);
        Persons maria = new Persons("Maria", "Mono", "Pila", "13.345.678-l", 35);
        Persons lola = new Persons("lola", "Masa", "lila", "16.345.678-l", 30);

        List<Persons> personsList = new ArrayList<Persons>();
        personsList.add(alex);
        personsList.add(maria);
        personsList.add(lola);

        for (Persons persons: personsList) {
            System.out.println(persons);
        }

        Collections.sort(personsList);
        for (Persons persons: personsList) {
            System.out.println(persons);
        }
    }
}
