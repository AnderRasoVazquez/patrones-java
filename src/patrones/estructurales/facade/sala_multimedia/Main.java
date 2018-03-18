package patrones.estructurales.facade.sala_multimedia;

public class Main {

    public static void main(String[] args) {
        /*
        Se quiere implementar un sistema que gestiona una sala multimedia:
        En esa sala hay 2 tipos de actos: películas y charlas
        - En los dos casos hay que bajar la pantalla y
        encender el proyector
        - En la proyección de películas, es necesario:
            - Poner el proyector en modo DVD, encender el
            DVD, encender los altavoces, ajustar su volumen,
            insertar el disco y poner el disco en marcha
        - En las charlas, hay que:
            - Poner el proyector en modo PC, encender el
        ordenador y poner en marcha la presentación
         */

        /*
        Se ha decidido usar singletons para las clases
         */
        FacadeControladorSala.getInstance().prepararPelicula();
        System.out.println("###########################################");
        System.out.println("###########################################");
        System.out.println("###########################################");
        FacadeControladorSala.getInstance().prepararCharla();
    }
}
