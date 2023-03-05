package poo;

public class CocheMain {

    public static void main(String[] args) {

        String coche = "alfa romero";
        Coche cocheObj = new Coche();

        Coche cocheObj1 = new Coche("red", "honda", 1430.45,"civic", 5.4 );

        cocheObj1.acelerar(50);
        System.out.println(cocheObj1);

        cocheObj1.peso = 1420.45;
        System.out.println(cocheObj1);

        CocheElectrico cocheElectrico = new CocheElectrico();
        cocheElectrico.color = "verde";
        cocheElectrico.fabricante = "civic";
        cocheElectrico.modelo = "2015";
        cocheElectrico.motorElectrico = "Ejemplo motor";

        System.out.println(cocheElectrico);


        CocheElectrico cocheElectrico1 = new CocheElectrico("azul", "alfa", 150.45, "2015",4.99,"Tx9");

        System.out.println(cocheElectrico1);
    }
}
