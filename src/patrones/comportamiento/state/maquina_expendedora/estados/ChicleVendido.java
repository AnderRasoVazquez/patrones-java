package patrones.comportamiento.state.maquina_expendedora.estados;

import patrones.comportamiento.state.maquina_expendedora.Maquina;

public class ChicleVendido implements IEstado{
    private Maquina maquina;

    public ChicleVendido(Maquina maquina) {
        this.maquina = maquina;
    }

    @Override
    public void meterDinero() {
        System.out.println("No se puede meter dinero mientras se expende un chicle");
    }

    @Override
    public void sacarDinero() {
        System.out.println("No se puede sacar dinero mientras se expende un chicle");
    }

    @Override
    public void girarManecilla() {
        System.out.println("No se puede girar la manecilla mientras se expende un chicle");
    }

    @Override
    public void expenderChicle() {
        maquina.soltarChicle();
        if (maquina.getNumChicles() > 0){
            maquina.setEstadoActual(maquina.getSinDinero());
        } else {
            maquina.setEstadoActual(maquina.getVacia());
        }
    }
}
