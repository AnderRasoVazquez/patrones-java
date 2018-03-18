package patrones.comportamiento.state.maquina_expendedora.estados;

import patrones.comportamiento.state.maquina_expendedora.Maquina;

public class SinDinero implements IEstado{
    private Maquina maquina;

    public SinDinero(Maquina maquina) {
        this.maquina = maquina;
    }

    @Override
    public void meterDinero() {
        this.maquina.setEstadoActual(maquina.getConDinero());
        System.out.println("dinero metido a la maquina");
    }

    @Override
    public void sacarDinero() {
        System.out.println("No hay dinero metido no se puede sacar.");
    }

    @Override
    public void girarManecilla() {
        System.out.println("No hay dinero metido, la manecilla no gira.");

    }

    @Override
    public void expenderChicle() {
        System.out.println("No se ha comprado nada el chicle no se expende.");
    }
}
