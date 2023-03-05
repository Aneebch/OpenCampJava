package poo;

public class CocheElectrico extends Coche {

    String motorElectrico;

    public CocheElectrico(){

    }

    public CocheElectrico(String motorElectrico){
        this.motorElectrico = motorElectrico;
    }

    @Override
    public String toString() {
        return "CocheElectrico{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", peso=" + peso +
                ", modelo='" + modelo + '\'' +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
