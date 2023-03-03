package Herencia;

public class Company {

    public static void main(String[] args) {
        // create a instance of employe type
        Employe employe = new Employe();

        employe.setName("Aneeb");
        employe.setFirstSurname("chatha");
        employe.setSecondSurname("rehman");
        employe.setDni("Aneeb");
        employe.setAge(40);
        employe.setAntiguedad(20);
        employe.setRole("Boss");
        employe.setSalary(1800.0);

        System.out.println(employe);
        employe.refreshSalary(150.0);
        System.out.println(employe);

    }
}
