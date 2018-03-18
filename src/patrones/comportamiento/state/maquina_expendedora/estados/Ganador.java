package patrones.comportamiento.state.maquina_expendedora.estados;

import patrones.comportamiento.state.maquina_expendedora.Maquina;

public class Ganador implements IEstado{

    private Maquina maquina;

    public Ganador(Maquina maquina) {
        this.maquina = maquina;
    }

    @Override
    public void meterDinero() {
        System.out.println("No se puede meter dinero mientras sale un chicle.");
    }

    @Override
    public void sacarDinero() {
        System.out.println("No se puede sacar dinero mientras sale un chicle.");
    }

    @Override
    public void girarManecilla() {
        System.out.println("No se puede girar la manecilla mientras sale un chicle.");
    }

    @Override
    public void expenderChicle() {
        System.out.println("Eres un ganador, para ti dos chicles.");
        maquina.soltarChicle();
        if (maquina.getNumChicles() > 0){
            maquina.soltarChicle();
            if (maquina.getNumChicles() > 0){
                maquina.setEstadoActual(maquina.getSinDinero());
            } else {
                maquina.setEstadoActual(maquina.getVacia());
            }
        } else {
            maquina.setEstadoActual(maquina.getVacia());
        }
    }
}
