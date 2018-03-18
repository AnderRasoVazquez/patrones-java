package patrones.estructurales.composite.taller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Compuesto implements Componente{

    private Collection<Componente> nComponentes;
    private String nombre;

    public Compuesto(String pNombre) {
        nComponentes = new ArrayList<Componente>();
        nombre = pNombre;
    }

    @Override
    public double calcularPrecio() {
        Componente unComp;
        Iterator<Componente> it = nComponentes.iterator();
        double precio = 0;
        while (it.hasNext()){
            unComp = it.next();
            precio += unComp.calcularPrecio();
        }
        return precio;
    }

    public void addComponente(Componente pComponente) {
        nComponentes.add(pComponente);
    }

    public void rmComponente(Componente pComponente) {
        nComponentes.remove(pComponente);
    }
}
