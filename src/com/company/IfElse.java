package com.company;

public class IfElse {

    public static void main(String[] args) {
        boolean check = 8 < 10;

        int num1 = 5;
        int num2 = 10;
        int num3 = 20;

        if(num1 < num2 || num2 < num3){
            System.out.println("True");
        }else if (num3 < num2){
            System.out.println("False");
        }else{
            System.out.println("Shit");
        }

        System.out.println("FIN");
    }
}
