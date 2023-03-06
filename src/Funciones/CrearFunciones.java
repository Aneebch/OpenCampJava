package Funciones;

public class CrearFunciones {

    public static void main(String[] args) {

        // Function without any parameter no return type
        showMenu();

        // Function without any parameter and a return type
        String menu = getMenu();
        System.out.println(menu);
        // Function with a parameter

        printGreet(" Jiii");


        // Function with a parameter and a return type
        String name = "Alan";
        String surname = "Turing";

        String greet = sayGreet(name,surname);

        System.out.println(greet);

        // Function with a parameter of number and a return type

        int result1 = plus(20, 10);
        int result2 = plus(10, 20);


    }

    static int plus(int num1,int num2) {
        return num1 + num2;
    }

    static String sayGreet(String name, String surname) {
        return "Hola Mola" + name + surname;
    }

    static void printGreet(String text) {
        System.out.println("Hola Mola" + text);
    }


    static void showMenu(){
        System.out.println("Welcome to E-commerce website");
        System.out.println("1 - See Shoes");
        System.out.println("2 -  Buy shoes");
        System.out.println("3 - Quite");
    }

    static String getMenu(){
        return "Welcome to E-Commerce website form a method with a String return tipe";
    }

    static String newMenu(){
        return "Welcome to E-Commerce website form a method with a String return tipe";
    }

}
