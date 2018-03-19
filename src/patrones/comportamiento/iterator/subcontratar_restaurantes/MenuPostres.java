package patrones.comportamiento.iterator.subcontratar_restaurantes;

import java.util.Iterator;

public class MenuPostres implements IMenu{

    private MenuItem[] lista;
    private int num_items = 0;
    static final int MAX_ITEMS = 6;

    public MenuPostres() {
        this.lista = new MenuItem[MAX_ITEMS];
        add(new MenuItem("helado", 2));
        add(new MenuItem("fruta", 1));
        add(new MenuItem("tarta", 3.5));

    }

    public void add(MenuItem item) {
        if (num_items >= MAX_ITEMS) {
            System.out.println("Alcanzado limite del menu, imposible añadir mas.");
        } else {
            lista[0] = item;
            num_items++;
        }
    }

    private class MenuItemIterator implements Iterator {
        MenuItem[] suLista;
        private int pos = 0;

        public MenuItemIterator(MenuItem[] pLista){
            suLista = pLista;
        }

        @Override
        public boolean hasNext() {
            if (pos >= suLista.length || suLista[pos] == null) {
                return false;
            } else {
                return true;
            }
        }

        @Override
        public Object next() {
            MenuItem item = suLista[pos];
            pos++;
            return item;
        }
    }

    @Override
    public Iterator<MenuItem> getIterator() {
        return new MenuItemIterator(this.lista);
    }
}
