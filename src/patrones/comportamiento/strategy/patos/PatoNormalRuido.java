package patrones.comportamiento.strategy.patos;

public class PatoNormalRuido implements IHacerRuido{
    @Override
    public void hazRuido() {
        System.out.println("Quack!");
    }
}
