package patrones.estructurales.facade.sala_multimedia;

public class Ordenador {
    private static Ordenador instance;

    public static Ordenador getInstance() {
        if (instance == null) {
            instance = new Ordenador();
        }
        return instance;
    }

    public void encender(){
        System.out.println("El ordenador se enciende");
    }

    public void ejecutarPresentacion(){
        System.out.println("El ordenador ha puesto en marcha la presentacion.");
    }
}
