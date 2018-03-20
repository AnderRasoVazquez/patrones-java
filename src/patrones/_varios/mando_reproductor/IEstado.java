package patrones._varios.mando_reproductor;

public interface IEstado {
    public void subirVol();
    public void bajarVol();
    public void power();
    public void modoDVD();
    public void modoUSB();
    public void modoRadio();
}
