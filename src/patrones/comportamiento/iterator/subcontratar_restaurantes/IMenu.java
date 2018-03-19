package patrones.comportamiento.iterator.subcontratar_restaurantes;

import java.util.Iterator;

public interface IMenu {

    public Iterator<MenuItem> getIterator();
}
