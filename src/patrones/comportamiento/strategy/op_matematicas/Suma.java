package patrones.comportamiento.strategy.op_matematicas;

import java.util.Collection;
import java.util.Iterator;

public class Suma implements IOperation{

    @Override
    public double ejecutar(Collection c) {
        double suma = 0;
        Iterator<Double> it = c.iterator();
        while(it.hasNext()){
            suma += it.next();
        }
        return suma;
    }
}
