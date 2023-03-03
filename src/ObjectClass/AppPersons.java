package ObjectClass;

import java.util.Scanner;

public class AppPersons {

    public static void main(String[] args) {
        // Create Scanner
        Scanner keyword = new Scanner(System.in);

        // Create an instance of person
        Persons individual = new Persons();

        // Give new value

        System.out.println("Introduce your name");
        individual.setName(keyword.next());
        System.out.println("Introduce your firstName");
        individual.setFirstSurname(keyword.next());
        System.out.println("Introduce your SecondSurname");
        individual.setSecondSurname(keyword.next());
        System.out.println("Introduce your dni");
        individual.setDni(keyword.next());
        System.out.println("Introduce your age");
        individual.setAge(keyword.nextInt());

        //
        System.out.println(individual);
    }
}
