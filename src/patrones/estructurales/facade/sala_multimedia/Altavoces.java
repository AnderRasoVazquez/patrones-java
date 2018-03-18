package patrones.estructurales.facade.sala_multimedia;

public class Altavoces {
    private static Altavoces instance;

    public static Altavoces getInstance() {
        if (instance == null) {
            instance = new Altavoces();
        }
        return instance;
    }

    public void encender(){
        System.out.println("Los altavoces se encienden.");
    }

    public void ajustarVolumen(){
        System.out.println("Se ajusta el volumen de los altavoces.");
    }
}
