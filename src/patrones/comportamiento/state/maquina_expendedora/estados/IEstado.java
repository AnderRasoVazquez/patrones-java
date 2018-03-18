package patrones.comportamiento.state.maquina_expendedora.estados;

public interface IEstado {
    public void meterDinero();
    public void sacarDinero();
    public void girarManecilla();
    public void expenderChicle();
}
