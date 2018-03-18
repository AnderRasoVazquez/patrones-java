package patrones.generadores.iterator.subcontratar_restaurantes;

public class MenuItem {

    private String nombre;
    private double precio;

    public MenuItem(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return nombre + ": " + precio + " $";
    }

    public String getNombre(){
        return nombre;
    }
}
