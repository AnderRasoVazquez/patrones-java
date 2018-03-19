package patrones.comportamiento.strategy.op_matematicas;

import java.util.Collection;
import java.util.Iterator;

public class Media implements IOperation {
    @Override
    public double ejecutar(Collection c) {
        double media = 0;
        Iterator<Double> it = c.iterator();
        while(it.hasNext()){
            media += it.next();
        }
        return media/c.size();
    }
}

