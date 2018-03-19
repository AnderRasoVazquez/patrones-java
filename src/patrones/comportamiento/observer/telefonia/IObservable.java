package patrones.comportamiento.observer.telefonia;

public interface IObservable {
    public void suscribir(IObserver o);
    public void baja(IObserver o);
    public void llamada(IObserver o);
}
