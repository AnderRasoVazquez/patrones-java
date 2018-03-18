package patrones.generadores.simple_factory.arkanoid;

public abstract class Ladrillo {
    private int vida;

    public void rebotar() { this.vida--; }

    public boolean destruido() {return this.vida == 0;}
}
