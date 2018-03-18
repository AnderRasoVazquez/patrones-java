package patrones.comportamiento.strategy;

public class NoVolar implements IVolar {

    @Override
    public void volar() {
        System.out.println("No vuela!");
    }
}
