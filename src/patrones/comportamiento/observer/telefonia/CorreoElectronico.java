package patrones.comportamiento.observer.telefonia;

import java.util.ArrayList;

public class CorreoElectronico implements IObservable, IObserver{

    private String correo;
    private ArrayList<IObserver> suscritos;

    public CorreoElectronico(String correo) {
        this.correo = correo;
        suscritos = new ArrayList<>();
    }

    @Override
    public void suscribir(IObserver o) {
        suscritos.add(o);
    }

    @Override
    public void baja(IObserver o) {
        suscritos.remove(o);
    }

    @Override
    public void update(IObserver origen, IObserver quien) {
        System.out.println("Mensaje al correo, en " + origen.getIdentificador() + ", se ha recibido " +
                "una llamada de " + quien.getIdentificador() + ".");
    }

    @Override
    public void llamada(IObserver quien) {
        for (IObserver o: suscritos) {
            o.update(this, quien);
        }
    }

    @Override
    public String getIdentificador() {
        return correo;
    }
}
