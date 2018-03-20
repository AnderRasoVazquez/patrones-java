package patrones.estructurales.composite.bebidas;

public class Infusion implements IBebida {

    private double precio = 1;

    @Override
    public double calcularPrecio() {
        return precio;
    }

    @Override
    public void actualizarPrecio(String b, double d) {
        if (this.getClass().getName().equals(b)){
            precio = d;
        }
    }
}
