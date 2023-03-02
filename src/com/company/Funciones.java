package com.company;

public class Funciones {

    public static void main(String[] args) {

        //holaMundo();
        //holaMundo();

        /*
        holaMundo("Alan");
        holaMundo("aneeb");

         */
        System.out.println(sum(5,6));
        String hola = devolverTexto();
        System.out.println(hola);
    }

    public static void holaMundo() {
        System.out.println("Hola mundo desde un methodo");
        System.out.println("Hola Mundo");
    }

    private static void holaMundo(String name) {
        System.out.println("Hola mundo desde un methodo");
        System.out.println("Hola " + name);
    }

    private static String devolverTexto() {
        return "Hola";
    }

    private static int sum(int num1, int num2) {
        return num1 + num2;
    }

}
