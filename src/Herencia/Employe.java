package Herencia;

import ObjectClass.Persons;

public class Employe extends Persons {

    private int antiguedad;
    private double salary;
    private String role;

    public Employe () {

    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void refreshSalary(double increment) {
        salary = salary + increment;
    }

    @Override
    public String toString() {
        return super.toString() + "Employe{" +
                "antiguedad=" + antiguedad +
                ", salary=" + salary +
                ", role='" + role + '\'' +
                '}';
    }
}
