package Strings;

public class Coche {

    String marca = "nombre de coche";


    public Coche(){

    }

    public Coche(String marca){
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                '}';
    }
}
