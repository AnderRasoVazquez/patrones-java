package patrones.comportamiento.state.maquina_expendedora.estados;

import patrones.comportamiento.state.maquina_expendedora.Maquina;

import java.util.Random;

public class ConDinero implements IEstado{
    private Maquina maquina;

    public ConDinero(Maquina maquina) {
        this.maquina = maquina;
    }

    @Override
    public void meterDinero() {
        System.out.println("Ya hay dinero metido");

    }

    @Override
    public void sacarDinero() {
        this.maquina.setEstadoActual(maquina.getSinDinero());
        System.out.println("dinero retirado de la maquina");
    }

    @Override
    public void girarManecilla() {
        Random random = new Random();
        if ((random.nextInt(10) + 1) % 10 == 0) {
            this.maquina.setEstadoActual(maquina.getGanador());
        } else {
            this.maquina.setEstadoActual(maquina.getChicleVendido());
        }
        System.out.println("girando manecilla con dinero metido");
    }

    @Override
    public void expenderChicle() {
        System.out.println("No se puede expender hasta que se gire la manecilla");
    }
}
