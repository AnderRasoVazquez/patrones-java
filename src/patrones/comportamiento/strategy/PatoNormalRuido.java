package patrones.comportamiento.strategy;

public class PatoNormalRuido implements IHacerRuido{
    @Override
    public void hazRuido() {
        System.out.println("Quack!");
    }
}
