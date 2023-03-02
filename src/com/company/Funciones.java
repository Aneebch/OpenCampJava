package com.company;

public class Funciones {

    public static void main(String[] args) {

        //holaMundo();
        //holaMundo();

        /*
        holaMundo("Alan");
        holaMundo("aneeb");

         */

        String hola = devolverTexto();
        System.out.println(hola);
    }

    private static void holaMundo() {
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



}
