package patrones.estructurales.facade.sala_multimedia;

public class FacadeControladorSala {
    
    private static FacadeControladorSala instance;
    
    public static FacadeControladorSala getInstance() {
        if (instance == null) {
            instance = new FacadeControladorSala();
        }
        return instance;
    }

    public void prepararPelicula(){
        prepararPantalla();
        Proyector.getInstance().modoDVD();
        DVD.getInstance().encender();
        Altavoces.getInstance().encender();
        Altavoces.getInstance().ajustarVolumen();
        DVD.getInstance().insertarDisco();
        DVD.getInstance().play();
    }

    public void prepararCharla(){
        prepararPantalla();
        Proyector.getInstance().modoOrdenador();
        Ordenador.getInstance().encender();
        Ordenador.getInstance().ejecutarPresentacion();
    }

    private void prepararPantalla(){
        Pantalla.getInstance().bajar();
        Proyector.getInstance().encender();
    }
}
