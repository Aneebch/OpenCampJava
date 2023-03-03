package AbstractClass;

public class Calcul {

    private final static double LADO_CUADRADO = 2.0;
    public static void main(String[] args) {
        // cREAR UNA INSTANCIA
        Square square = new Square();

        square.setSides(LADO_CUADRADO);

        System.out.println("El area del cuadrado es "+ square.calArea());
        System.out.println("El perimeter del cuadrado es "+ square.calPerimeter());

    }
}
