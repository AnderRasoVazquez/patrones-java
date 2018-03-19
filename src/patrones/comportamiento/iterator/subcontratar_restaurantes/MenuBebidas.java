package patrones.comportamiento.iterator.subcontratar_restaurantes;

import java.util.Hashtable;
import java.util.Iterator;

public class MenuBebidas implements IMenu{

    public Hashtable<String, MenuItem> lista;

    public MenuBebidas() {
        lista = new Hashtable<String, MenuItem>();
        add(new MenuItem("agua", 0));
        add(new MenuItem("refresco", 1.5));
    }

    public void add(MenuItem item){
        lista.put(item.getNombre(), item);
    }

    @Override
    public Iterator<MenuItem> getIterator() {
        return lista.values().iterator();
    }
}
