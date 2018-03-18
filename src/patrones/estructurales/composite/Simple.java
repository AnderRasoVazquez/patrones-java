package patrones.estructurales.composite;

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

    @Override
    public void cambiarPrecio(double pPrecio) {
        precio = pPrecio;
    }

    public String getNombre() {
        return nombre;
    }
}
