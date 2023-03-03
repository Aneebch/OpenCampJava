package Herencia;

public class Comercial extends Employe {

    private double comision;
    public Comercial () {

    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public void calcularComision(double incComision){
        comision = comision + incComision;
    }
    public void calcularComision(double incComision, double plus){
        comision = comision + incComision + plus;
    }

    @Override
    public void refreshSalary(double increment) {
        double actualSalary = this.getSalary();

        if (this.getAntiguedad()<=5){
            calcularComision(25.0);
        } else {
            calcularComision(25.0, 100.0);
        }
        double newComision = comision;
        this.setSalary(actualSalary + increment + newComision);
    }


}
