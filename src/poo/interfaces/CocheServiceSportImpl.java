package poo.interfaces;

import poo.Coche;
import poo.CocheElectrico;
import poo.interfaces.CocheService;

public class CocheServiceSportImpl implements CocheService {


    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando un coche carrera");
        return new CocheElectrico();
    }

    @Override
    public void destroyCoche(Coche coche) {

    }
}
