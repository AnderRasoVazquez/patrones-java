package patrones.generadores.singleton.classic_singleton;

/**
 * Singleton intenta crear un objeto que solo pueda ser instanciado una vez.
 */
public class Singleton {

    private static Singleton instancia;
    // mas variables por aqui

    private Singleton() {}

    public static Singleton getInstancia() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }

    // otros metodos utiles aqui
}
