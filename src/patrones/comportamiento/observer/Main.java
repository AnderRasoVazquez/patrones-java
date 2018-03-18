package patrones.comportamiento.observer;

public class Main {

    public static void main(String[] args) {
        EstacionMetereologica estacion = new EstacionMetereologica();

        TemperaturaDisplay tempDisplay = new TemperaturaDisplay(estacion);
        HumedadDisplay humDisplay = new HumedadDisplay(estacion);

        estacion.setValues(27.6, 99.6);
        estacion.setValues(28.6, 93.6);


        System.out.println("Ahora eliminamos el sensor de temperatura y actualizamos valores");
        estacion.removeObserver(tempDisplay);
        estacion.setValues(28.6, 97.6);

        System.out.println("Ahora volvemos a añadir el sensor de temperatura y actualizamos valores");
        estacion.addObserver(tempDisplay);
        estacion.setValues(28.6, 97.6);
    }
}
