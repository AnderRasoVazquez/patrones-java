package patrones.comportamiento.strategy;

public class Pato {

    private IVolar volarComp;

    private IHacerRuido ruidoComp;

    public Pato() {}

    public Pato(IVolar volarComp, IHacerRuido ruidoComp) {
        this.ruidoComp = ruidoComp;
        this.volarComp = volarComp;
    }

    public void info() {
        System.out.println("Un pato sin mas.");
    }

    public void setVolarComp(IVolar volarComp) {
        this.volarComp = volarComp;
    }

    public void setRuidoComp(IHacerRuido ruidoComp) {
        this.ruidoComp = ruidoComp;
    }

    public void quack() {
        this.ruidoComp.hazRuido();
    }

    public void vuela() {
        this.volarComp.volar();
    }
}
