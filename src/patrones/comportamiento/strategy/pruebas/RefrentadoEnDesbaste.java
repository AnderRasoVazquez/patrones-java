package patrones.comportamiento.strategy.pruebas;

public class RefrentadoEnDesbaste implements IPieza{

    public RefrentadoEnDesbaste() {
    }

    @Override
    public Pieza ejecutar(Pieza pieza) {
        return new PiezaBruta();
    }
}
