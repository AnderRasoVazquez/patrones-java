package patrones.estructurales.composite.taller;

public class Simple implements Componente {

    private double precio;
    private String nombre;

    public Simple(double pPrecio, String pNombre) {
        precio = pPrecio;
        nombre = pNombre;
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }
}
