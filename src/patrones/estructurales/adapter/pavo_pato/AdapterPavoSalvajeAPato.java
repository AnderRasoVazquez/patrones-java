package patrones.estructurales.adapter.pavo_pato;

public class AdapterPavoSalvajeAPato implements IPato{
    private PavoSalvaje pavo;

    // contructor para que cree un pavo
    public AdapterPavoSalvajeAPato() {
        pavo = new PavoSalvaje();
    }

    // contructor para darle un pavo ya creado
    public AdapterPavoSalvajeAPato(PavoSalvaje pPavo) {
        pavo = pPavo;
    }

    @Override
    public void quack() {
        pavo.ruidoDePavo();
    }

    @Override
    public void vuela() {
        // intenta ir lejos como los otros patos pero solo da varios saltos
        for (int i = 0; i < 5; i++) pavo.saltoAleteando();
    }
}
