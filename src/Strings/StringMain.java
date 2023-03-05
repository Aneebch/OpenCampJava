package Strings;

public class StringMain {

    public static void main(String[] args) {

        // la clase String

        /*
        length()
        toUpperCase()
        startWith()
        endsWith()
        indexOf()
        substring(1, 5)
        trim()
        equals()
        compareTo()


         */

        String cadena = "Hola Mundo";
        System.out.println(cadena.length());
        System.out.println(cadena);
        String cadenaM = cadena.toUpperCase();
        String cadenaTri = cadenaM.trim();

        String otro = "HOLA MUNDO";
        if (cadenaM.equals(otro)) {
            System.out.println("Las cadenas son iguales");
        }
    }
}
