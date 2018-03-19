package patrones.comportamiento.observer.telefonia;

public class Main {

    public static void main(String[] args) {
        TelefonoFijo tfijo = new TelefonoFijo ("943015052");
        TelefonoMovil tmovil = new TelefonoMovil ("Mi movil");
        CorreoElectronico correo = new CorreoElectronico ("is@ehu.es");
        Busca bu = new Busca ("Mi Busca");
        tfijo.suscribir(tmovil);
        tfijo.suscribir(bu);
        tfijo.llamada(new TelefonoFijo("943015555"));
        tfijo.baja(bu);
        tfijo.llamada(correo);
        correo.suscribir(tmovil);
        correo.suscribir(tfijo);
        correo.llamada(bu);
    }
}
