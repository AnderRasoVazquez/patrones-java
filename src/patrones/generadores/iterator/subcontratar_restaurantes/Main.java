package patrones.generadores.iterator.subcontratar_restaurantes;

import java.util.Iterator;

public class Main {

    /*
    Tenemos un local que ha subcontratado a 3 restaurantes diferentes.
    El primer restaurante tiene un menu de platos principales implementado con un arraylist.
    El segundo restaurante tiene un menu de postres implementado con un array.
    El tercer restaurante tiene un menu de bebidas implementado con un hashmap.
    Por suerte los 3 restaurantes implementan los items del menu con MenuItem.

    Se supone que queremos ir al local y que el/la camarer@ nos diga la carta con todos los menus,
    el caso es que el personal no tiene ni idea de que tipo de lista ha usado cada restaurante,
    solo sabe que los menus usan la interfaz IMenu.
     */

    public static void main(String[] args) {
        MenuPrincipales mPrincipales = new MenuPrincipales();
        MenuPostres mPostres = new MenuPostres();
        MenuBebidas mBebidas = new MenuBebidas();
        Personal p = new Personal();
        p.addMenu(mPrincipales);
        p.addMenu(mBebidas);
        p.addMenu(mPostres);
        p.printAllMenus();
    }
}
