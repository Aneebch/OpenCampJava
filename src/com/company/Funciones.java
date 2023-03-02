package com.company;

public class Funciones {

    public static void main(String[] args) {

        //holaMundo();
        //holaMundo();

        /*
        holaMundo("aneeb");

         */
        holaMundo("Aneeb", "chatha");
        holaMundo(7);
        System.out.println(sum(5,6));
        String hola = devolverTexto();
        System.out.println(hola);
    }

    public static void holaMundo() {
        System.out.println("Hola mundo desde un methodo");
        System.out.println("Hola Mundo");
    }

    private static void holaMundo(Integer num) {
        System.out.println("El numero es : " + num);
    }
    private static void holaMundo(String name, String surname) {
        System.out.println("Hola mundo desde un methodo");
        System.out.println("Hola " + name + " "+ surname);
    }

    private static String devolverTexto() {
        return "Hola";
    }

    private static int sum(int num1, int num2) {
        return num1 + num2;
    }

}
