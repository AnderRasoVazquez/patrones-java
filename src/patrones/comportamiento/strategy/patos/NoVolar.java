package patrones.comportamiento.strategy.patos;

public class NoVolar implements IVolar {

    @Override
    public void volar() {
        System.out.println("No vuela!");
    }
}
