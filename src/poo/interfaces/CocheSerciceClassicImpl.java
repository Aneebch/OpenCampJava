package poo.interfaces;

import poo.Coche;
import poo.CocheElectrico;
import poo.interfaces.CocheService;

public class CocheSerciceClassicImpl implements CocheService {


    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche classic");
        return new CocheElectrico();
    }

    @Override
    public void destroyCoche(Coche coche) {
        System.out.println("destruyendo coche classic");
    }
}
