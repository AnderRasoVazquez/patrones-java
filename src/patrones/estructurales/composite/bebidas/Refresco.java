package patrones.estructurales.composite.bebidas;

public class Refresco implements IBebida {

    private double precio = 10;

    @Override
    public double calcularPrecio() {
        return precio;
    }

    @Override
    public void actualizarPrecio(String b, double d) {
        if (this.getClass().getName().equals(b)) {
            precio = d;
        }
    }
}
