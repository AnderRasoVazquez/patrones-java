package patrones.comportamiento.iterator.subcontratar_restaurantes;

import java.util.ArrayList;
import java.util.Iterator;

public class Personal {
    private ArrayList<IMenu> listaMenus;

    public Personal() {
        listaMenus = new ArrayList<IMenu>();
    }

    public void addMenu(IMenu menu){
        listaMenus.add(menu);
    }

    public void printAllMenus(){
        Iterator it = listaMenus.iterator();
        while (it.hasNext()){
            printOneMenu((IMenu) it.next());
        }
    }

    private void printOneMenu(IMenu menu) {
        Iterator it = menu.getIterator();
        while (it.hasNext()){
            System.out.println(it.next().toString());
        }

    }
}
