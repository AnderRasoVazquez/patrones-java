package patrones.comportamiento.strategy.patos;

public class PatoDeGoma extends Pato {

    public PatoDeGoma() {
        super(new NoVolar(), new PatoGomaRuido());
    }

    @Override
    public void info() {
        System.out.println("Es un patito de goma");
    }
}
