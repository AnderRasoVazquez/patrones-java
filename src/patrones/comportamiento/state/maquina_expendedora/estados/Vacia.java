package patrones.comportamiento.state.maquina_expendedora.estados;

import patrones.comportamiento.state.maquina_expendedora.Maquina;

/**
 * Representa un estado en el que no hay chicles
 */
public class Vacia implements IEstado{

    private Maquina maquina;

    public Vacia(Maquina maquina) {
        this.maquina = maquina;
    }

    @Override
    public void meterDinero() {
        System.out.println("La maquina esta vacia, no te deja meter dinero.");

    }

    @Override
    public void sacarDinero() {
        System.out.println("No has metido dinero, no puedes sacar.");
    }

    @Override
    public void girarManecilla() {
        System.out.println("La maquina esta vacia, no se puede girar la manecilla.");

    }

    @Override
    public void expenderChicle() {
        System.out.println("No hay nada que expender.");

    }
}
