package ClassGenerica;

public class Operaciones <N extends Number> {

    double suma(N numero) {
        return numero.doubleValue() +2;
    }
    double resta(N numero) {
        return numero.doubleValue() -2;
    }
    double product(N numero) {
        return numero.doubleValue() *2;
    }
    double division(N numero) {
        return numero.doubleValue() /2;
    }
}
