package patrones.comportamiento.observer;

public class HumedadDisplay implements IDisplay, IObserver {

    private double humedad;
    private IObservable estacion;

    public HumedadDisplay(IObservable o) {
        this.estacion = o;
        this.estacion.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Humedad Display: " + this.humedad);
    }

    @Override
    public void update() {
        EstacionMetereologica s = (EstacionMetereologica) this.estacion;
        this.humedad = s.getHumedad();
        display();
    }
}
