package patrones.comportamiento.state.maquina_expendedora;

import patrones.comportamiento.state.maquina_expendedora.estados.*;

public class Maquina {

    private IEstado vacia;
    private IEstado sinDinero;
    private IEstado conDinero;
    private IEstado chicleVendido;
    private IEstado ganador;

    private IEstado estadoActual;

    private int numChicles;

    public Maquina(int numChicles) {
        vacia = new Vacia(this);
        sinDinero = new SinDinero(this);
        conDinero = new ConDinero(this);
        chicleVendido = new ChicleVendido(this);
        ganador = new Ganador(this);

        this.numChicles = numChicles;

        if (this.numChicles <= 0) {
            estadoActual = vacia;
        } else {
            estadoActual = sinDinero;
        }
    }

    public void rellenar(int num){
        numChicles += num;
        System.out.println("Rellenando maquina");
        estadoActual = sinDinero;
    }

    public void soltarChicle() {
        if (numChicles > 0) {
            numChicles--;
            System.out.println("Soltando chicle");
            System.out.println("Quedan " + numChicles + " chicles.");
        } else {
            System.out.println("No quedan chicles");
        }
    }

    public void meterDinero() {
        estadoActual.meterDinero();
    }

    public void sacarDinero() {
        estadoActual.sacarDinero();
    }

    /*
    No necesitamos una accion para expender el chicle, se hace al girar la manecilla
     */
    public void girarManecilla() {
        estadoActual.girarManecilla();
        estadoActual.expenderChicle();
    }

    public IEstado getVacia() {
        return vacia;
    }

    public IEstado getSinDinero() {
        return sinDinero;
    }

    public IEstado getConDinero() {
        return conDinero;
    }

    public IEstado getChicleVendido() {
        return chicleVendido;
    }

    public IEstado getGanador() {
        return ganador;
    }

    public void setEstadoActual(IEstado estadoActual) {
        this.estadoActual = estadoActual;
    }

    public int getNumChicles() {
        return numChicles;
    }
}
