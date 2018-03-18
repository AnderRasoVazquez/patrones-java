package patrones.comportamiento.strategy.patos;

public class PatoSalvaje extends Pato {

    public PatoSalvaje() {
        super(new VolarNormal(), new PatoNormalRuido());
    }

    @Override
    public void info() {
        System.out.println("Esto es un pato salvaje!");
    }
}
