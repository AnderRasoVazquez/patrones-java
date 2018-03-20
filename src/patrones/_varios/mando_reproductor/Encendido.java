package patrones._varios.mando_reproductor;

import patrones._varios.mando_reproductor.modos.DVD;
import patrones._varios.mando_reproductor.modos.USB;

public class Encendido implements IEstado{

    private Reproductor reproductor;

    public Encendido(Reproductor reproductor) {
        this.reproductor = reproductor;
    }


    @Override
    public void subirVol() {
        reproductor.subirVol(1);
    }

    @Override
    public void bajarVol() {
        reproductor.bajarVol(1);
    }

    @Override
    public void power() {
        reproductor.setEstado(new Apagado());
    }

    @Override
    public void modoDVD() {
        reproductor.setModo(new DVD());
    }

    @Override
    public void modoUSB() {
        reproductor.setModo(new USB());
    }

    @Override
    public void modoRadio() {
        reproductor.setModo(new DVD());
    }
}
