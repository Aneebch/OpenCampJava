package com.company;

public class WhileLoop {

    public static void main(String[] args) {

        boolean check = true;

        int count = 0;
        while(count < 10){
            count++; // condition
            if(count == 6)
                break; // rompe el flujo de bucle y sale de bucle.
                //continue; // salta el valor 6 y coninua a la siguiente iteración
            System.out.println("hello world " + count);

        }
        System.out.println("Final");
    }
}
