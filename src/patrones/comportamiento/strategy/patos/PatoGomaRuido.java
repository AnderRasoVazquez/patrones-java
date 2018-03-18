package patrones.comportamiento.strategy.patos;

public class PatoGomaRuido implements IHacerRuido{
    @Override
    public void hazRuido() {
        System.out.println("Squeak! Un ruido de pato de goma, vamos xD");
    }
}
