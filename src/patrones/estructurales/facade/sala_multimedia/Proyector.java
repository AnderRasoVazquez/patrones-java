package patrones.estructurales.facade.sala_multimedia;

public class Proyector {
    private static Proyector instance;

    public static Proyector getInstance() {
        if (instance == null) {
            instance = new Proyector();
        }
        return instance;
    }

    public void encender(){
        System.out.println("El proyector se enciende.");
    }

    public void modoOrdenador(){
        System.out.println("El proyector se ha puesto en modo ordenador.");
    }

    public void modoDVD() {
        System.out.println("El proyector se ha puesto en modo DVD");
    }
}
