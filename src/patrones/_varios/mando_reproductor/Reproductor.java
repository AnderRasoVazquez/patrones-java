package patrones._varios.mando_reproductor;

import patrones._varios.mando_reproductor.modos.Radio;

import java.util.Collection;
import java.util.Enumeration;

public class Reproductor {

    private static Reproductor instance;

    private int vol;
    private IEstado estado;
    private Modo modo;

    public static Reproductor getInstance() {
        if (instance == null) {
            instance = new Reproductor();
            instance.setEstado(new Encendido(instance));
            instance.setModo(new Radio());
        }
        return instance;
    }

    public void setEstado(IEstado estado) {
        this.estado = estado;
    }

    public void subirVol() {
        this.estado.subirVol();
    }

    public void subirVol(int num){
        vol += num;
    }

    public void bajarVol() {
        this.estado.bajarVol();
    }

    public void bajarVol(int num) {
        vol -= num;
    }

    public void power() {
        estado.power();
    }

    public void modoDVD() {
        estado.modoDVD();
    }

    public void modoUSB() {
        estado.modoUSB();
    }

    public void modoRadio() {
        estado.modoRadio();
    }

    public void setModo(Modo modo){
        this.modo = modo;
    }

}
