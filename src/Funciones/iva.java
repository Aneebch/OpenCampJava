package Funciones;

import java.util.Scanner;

public class iva {

    public static void main(String[] args) {

        System.out.println("Introduce the item value:");
        Scanner keys = new Scanner(System.in);
        double iva = keys.nextDouble();

        System.out.println("Introduce the tax value:");
        Scanner keys2 = new Scanner(System.in);
        float tax = keys2.nextFloat();

        double t = calIva(iva, tax);

        System.out.println("El IVA es: " + t);
    }


    static double calIva(double price, double tax) {
        var random = (tax/100)*(price) ;
        return random + price;
    }
}
