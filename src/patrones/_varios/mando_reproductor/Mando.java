package patrones._varios.mando_reproductor;

public class Mando {

    private static Mando instance;

    public static Mando getInstance() {
        if (instance == null) {
            instance = new Mando();
        }
        return instance;
    }

    public void subirVol() {
        Reproductor.getInstance().subirVol();
    }

    public void bajarVol() {
        Reproductor.getInstance().bajarVol();
    }

    public void power() {
        Reproductor.getInstance().power();
    }

    public void modoDVD() {
        Reproductor.getInstance().modoDVD();
    }

    public void modoUSB() {
        Reproductor.getInstance().modoUSB();
    }

    public void modoRadio() {
        Reproductor.getInstance().modoRadio();
    }

}
