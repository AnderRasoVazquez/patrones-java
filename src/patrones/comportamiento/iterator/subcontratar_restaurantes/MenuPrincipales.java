package patrones.comportamiento.iterator.subcontratar_restaurantes;

import java.util.ArrayList;
import java.util.Iterator;

public class MenuPrincipales implements IMenu {

    private ArrayList<MenuItem> lista;

    public MenuPrincipales() {
        this.lista = new ArrayList<MenuItem>();
        add(new MenuItem("arroz", 2));
        add(new MenuItem("pure", 2));
        add(new MenuItem("pasta", 2));
    }

    public void add(MenuItem item) {
        lista.add(item);
    }

    @Override
    public Iterator<MenuItem> getIterator() {
        return lista.iterator();
    }
}
