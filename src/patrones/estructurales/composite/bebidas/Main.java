package patrones.estructurales.composite.bebidas;

public class Main {
    public static void main(String[] args) {
        Combinado c = new Combinado();
        c.addBebida(new Refresco()); // vale 10
        c.addBebida(new Infusion()); // vale 1
        System.out.println(c.calcularPrecio()); // -> 11.0

        c.actualizarPrecio(Refresco.class.getName(), 5);
        System.out.println(c.calcularPrecio()); // -> 6.0
    }
}
