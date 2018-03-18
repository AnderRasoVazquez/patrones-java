package patrones.comportamiento.observer;

public class TemperaturaDisplay implements IDisplay, IObserver {

    private double temp;
    private IObservable estacion;

    public TemperaturaDisplay(IObservable o) {
        this.estacion = o;
        this.estacion.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Temperatura Display: " + this.temp);
    }

    @Override
    public void update() {
        EstacionMetereologica s = (EstacionMetereologica) this.estacion;
        this.temp = s.getTemp();
        display();
    }
}
