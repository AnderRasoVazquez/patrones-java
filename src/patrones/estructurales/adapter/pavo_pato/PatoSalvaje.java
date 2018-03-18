package patrones.estructurales.adapter.pavo_pato;

public class PatoSalvaje implements IPato{

    public PatoSalvaje(){};

    @Override
    public void quack() {
        System.out.println("quack!");
    }

    @Override
    public void vuela() {
        System.out.println("el pato esta volando!");
    }
}
