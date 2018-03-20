package patrones.estructurales.composite.bebidas;

import java.util.ArrayList;
import java.util.Iterator;

public class Combinado implements IBebida{

    private ArrayList<IBebida> ingredientes;

    public Combinado() {
        ingredientes = new ArrayList<>();
    }

    public void addBebida(IBebida b) {
        ingredientes.add(b);
    }

    @Override
    public double calcularPrecio() {
        double precioTotal = 0;
        Iterator<IBebida> it = ingredientes.iterator();
        while(it.hasNext()) {
            precioTotal += it.next().calcularPrecio();
        }
        return precioTotal;
    }

    @Override
    public void actualizarPrecio(String b, double d) {
        Iterator<IBebida> it = ingredientes.iterator();
        while(it.hasNext()) {
            it.next().actualizarPrecio(b, d);
        }
    }
}
