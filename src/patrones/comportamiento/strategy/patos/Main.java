package patrones.comportamiento.strategy.patos;

public class Main {

    public static void separador() {
        System.out.println("-------------------------------------------------");
    }

    public static void main(String[] args) {
        // write your code here
        Pato patoSimple = new Pato(new VolarNormal(), new PatoNormalRuido());
        PatoSalvaje patoSalvaje = new PatoSalvaje();
        PatoDeGoma patoDeGoma = new PatoDeGoma();

        patoSimple.info();
        patoSimple.quack();
        patoSimple.vuela();
        separador();

        patoSalvaje.info();
        patoSalvaje.quack();
        patoSalvaje.vuela();
        separador();

        patoDeGoma.info();
        patoDeGoma.quack();
        patoDeGoma.vuela();
        separador();

        System.out.println("Ahora el pato salvaje se cansa y ya no quiere volar");
        patoSalvaje.setVolarComp(new NoVolar());
        patoSalvaje.vuela();
        separador();

        System.out.println("El pato de goma aprende a hacer un quack de verdad");
        patoDeGoma.setRuidoComp(new PatoNormalRuido());
        patoDeGoma.quack();
        separador();

    }
}
