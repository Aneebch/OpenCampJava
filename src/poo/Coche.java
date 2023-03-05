package poo;

public class Coche {

    //atributes
    String color;
    String fabricante;
    Double peso;
    String modelo;
    Double largo;
    Integer velocidad = 0;

    //constructors
    public Coche(){

    }
    public Coche(String color,String fabricante,Double peso,String modelo,Double largo) {
        this.color = color;
        this.fabricante = fabricante;
        this.peso = peso;
        this.modelo = modelo;
        this.largo = largo;

    }

    // comportamiento

    public void acelerar(Integer cantidad){
        if(cantidad > 0 && cantidad < 120){
        this.velocidad += cantidad;
        }

    }

    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", peso=" + peso +
                ", modelo='" + modelo + '\'' +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
