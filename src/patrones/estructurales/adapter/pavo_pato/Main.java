package patrones.estructurales.adapter.pavo_pato;

public class Main {

    public static void main(String[] args){
        PatoSalvaje pato = new PatoSalvaje();
        pato.quack();
        pato.vuela();

        PavoSalvaje pavo = new PavoSalvaje();
        pavo.ruidoDePavo();
        pavo.saltoAleteando();

        AdapterPavoSalvajeAPato pavoQueSeCreePato = new AdapterPavoSalvajeAPato(pavo);
        pavoQueSeCreePato.quack();
        pavoQueSeCreePato.vuela();
    }
}
