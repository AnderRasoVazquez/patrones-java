package patrones.comportamiento.observer.telefonia;

public interface IObserver {
    public void update(IObserver origen, IObserver quien);
    public String getIdentificador();
}
