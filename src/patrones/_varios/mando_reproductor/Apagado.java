package patrones._varios.mando_reproductor;

public class Apagado implements IEstado{

    Reproductor reproductor;

    public Apagado(Reproductor reproductor) {
        this.reproductor = reproductor;
    }

    @Override
    public void subirVol() {

    }

    @Override
    public void bajarVol() {

    }

    @Override
    public void power() {
        Reproductor.getInstance().setEstado(new Encendido(reproductor));
    }

    @Override
    public void modoDVD() {

    }

    @Override
    public void modoUSB() {

    }

    @Override
    public void modoRadio() {

    }
}
