package ObjectClass;

import java.util.Objects;

public class Persons {

    // Atributes
    private String name;
    private String firstSurname;
    private String secondSurname;
    private String dni;
    private int age;

    //Empty Constructor
    public Persons () {

    }
    // Copy Constructor
    public Persons (Persons p) {
        this.name = p.name;
        this.firstSurname = p.firstSurname;
        this.secondSurname = p.secondSurname;
        this.dni = p.dni;
        this.age = p.age;
    }

    // constructor parameter
    public Persons (String name, String firstSurname, String secondSurname, String dni, int age) {
        this.name = name;
        this.firstSurname = firstSurname;
        this.secondSurname = secondSurname;
        this.dni = dni;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstSurname() {
        return firstSurname;
    }

    public void setFirstSurname(String firstSurname) {
        this.firstSurname = firstSurname;
    }

    public String getSecondSurname() {
        return secondSurname;
    }

    public void setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Persons{" +
                "name='" + name + '\'' +
                ", firstSurname='" + firstSurname + '\'' +
                ", secondSurname='" + secondSurname + '\'' +
                ", dni='" + dni + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persons persons = (Persons) o;
        return dni.equals(persons.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }
}
