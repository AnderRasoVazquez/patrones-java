package patrones.comportamiento.observer.telefonia;

import java.util.ArrayList;

public class Busca implements IObservable, IObserver{

    private String busca;
    private ArrayList<IObserver> suscritos;

    public Busca(String correo) {
        this.busca = correo;
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
        System.out.println("Mensaje al busca, en " + origen.getIdentificador() + ", se ha recibido " +
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
        return busca;
    }
}
