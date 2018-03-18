package patrones.comportamiento.state.maquina_expendedora;

public class Main {

    public static void main(String[] args) {
        Maquina m = new Maquina(5);
        m.meterDinero();
        m.girarManecilla();


        m.meterDinero();
        m.sacarDinero();
        m.girarManecilla();
    }
}
