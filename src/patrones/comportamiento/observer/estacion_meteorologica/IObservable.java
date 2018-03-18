package patrones.comportamiento.observer.estacion_meteorologica;

public interface IObservable {

    public void addObserver(IObserver o);
    public void removeObserver(IObserver o);
    public void updateObservers();

}
