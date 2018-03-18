package patrones.comportamiento.strategy;

public class VolarNormal implements IVolar {

    @Override
    public void volar() {
        System.out.println("Vuela normal!");
    }
}
