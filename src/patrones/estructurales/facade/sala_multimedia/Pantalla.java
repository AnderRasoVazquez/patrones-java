package patrones.estructurales.facade.sala_multimedia;

public class Pantalla {
    private static Pantalla instance;

    public static Pantalla getInstance() {
        if (instance == null) {
            instance = new Pantalla();
        }
        return instance;
    }

    public void bajar(){
        System.out.println("La pantalla se baja.");
    }
}
