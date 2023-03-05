package poo;

public class CocheElectrico extends Coche {

    String motorElectrico;

    public CocheElectrico(){

    }

    public CocheElectrico(String motorElectrico){
        this.motorElectrico = motorElectrico;
    }

    public CocheElectrico(String color,String fabricante,Double peso,String modelo,Double largo, String motorElectrico){
        super(color,fabricante,peso,modelo,largo);
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
