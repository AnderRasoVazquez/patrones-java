package patrones.estructurales.adapter.pavo_pato;

public class PavoSalvaje implements IPavo{

    public PavoSalvaje(){};

    @Override
    public void ruidoDePavo() {
        System.out.println("Pbrrpbrbpr!");
    }

    @Override
    public void saltoAleteando() {
        System.out.println("Salta moviendo las alitas, pero no vuela porque esta gordisimo el tio!");
    }
}
