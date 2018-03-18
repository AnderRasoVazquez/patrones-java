package patrones.estructurales.facade.sala_multimedia;

public class DVD {
    private static DVD instance;

    public static DVD getInstance() {
        if (instance == null) {
            instance = new DVD();
        }
        return instance;
    }

    public void encender(){
        System.out.println("El DVD se enciende.");
    }

    public void insertarDisco(){
        System.out.println("El disco se inserta.");
    }

    public void play(){
        System.out.println("El disco se pone en marcha.");
    }
}
