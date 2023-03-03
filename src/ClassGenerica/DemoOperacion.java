package ClassGenerica;

public class DemoOperacion {
    public static void main(String[] args) {
        Operaciones<Integer> opI = new Operaciones<Integer>();

        System.out.println("La suma es " + opI.suma(5));
        System.out.println("La resta es " + opI.resta(5));
        System.out.println("La divion es " + opI.division(5));
        System.out.println("La muliply es " + opI.product(5));

        Operaciones<Double> opD = new Operaciones<Double>();

        System.out.println("la suma es" + opD.suma(12.34));
        System.out.println("la resta es" + opD.resta(12.34));
        System.out.println("la division es" + opD.division(12.34));
        System.out.println("la producto es" + opD.product(12.34));
    }
}
