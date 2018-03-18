package patrones.generadores.simple_factory;

import java.util.Random;

public class Arkanoid {
    private static Arkanoid mArkanoid = null;
    private Ladrillo[][] ladrillos;

    private Arkanoid() {
        ladrillos = new Ladrillo[10][3];
    }

    ;

    public static Arkanoid getArkanoid() {
        if (mArkanoid == null) {
            mArkanoid = new Arkanoid();
        }
        return mArkanoid;
    }

    public void crearMuro() {
        Random rand = new Random();
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 10; i++) {
                int n = rand.nextInt(3);
                if (n == 0) {
                    ladrillos[j][i] = LadrilloFactory.getmLadrilloFactory().crearLadrillo("rojo");
                } else if (n == 1) {
                    ladrillos[j][i] = LadrilloFactory.getmLadrilloFactory().crearLadrillo("amarillo");
                } else if (n == 2) {
                    ladrillos[j][i] = LadrilloFactory.getmLadrilloFactory().crearLadrillo("verde");
                }
            }
        }
    }
}
