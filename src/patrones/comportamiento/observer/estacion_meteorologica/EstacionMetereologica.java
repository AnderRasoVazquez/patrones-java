package patrones.comportamiento.observer.estacion_meteorologica;

import java.util.ArrayList;

public class EstacionMetereologica implements  IObservable {

    private ArrayList<IObserver> observers;
    private double temp;
    private double humedad;

    public EstacionMetereologica() {
        this.observers = new ArrayList<IObserver>();
    }

    @Override
    public void addObserver(IObserver o) {
        int index = this.observers.indexOf(o);
        if (index < 0) {
            this.observers.add(o);
        }
    }

    @Override
    public void removeObserver(IObserver o) {
        int index = this.observers.indexOf(o);
        if (index >= 0) {
            this.observers.remove(index);
        }
    }

    @Override
    public void updateObservers() {
        for (IObserver o :
                this.observers) {
            o.update();
        }
    }

    public void setValues(double temp, double humedad) {
        this.temp = temp;
        this.humedad = humedad;
        this.updateObservers();
    }

    public double getTemp() {
        return temp;
    }

    public double getHumedad() {
        return humedad;
    }
}
