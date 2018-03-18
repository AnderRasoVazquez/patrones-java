package patrones.generadores.simple_factory;

public class LadrilloFactory {
    private static LadrilloFactory mLadrilloFactory = null;

    private LadrilloFactory() {};

    public static LadrilloFactory getmLadrilloFactory() {
        if (mLadrilloFactory == null) {
            mLadrilloFactory = new LadrilloFactory();
        }
        return mLadrilloFactory;
    }

    public Ladrillo crearLadrillo(String tipoLadrillo) {
        Ladrillo ladrillo = null;
        switch (tipoLadrillo) {
            case "verde":
                ladrillo = new LadrilloDebil();
                break;
            case "amarillo":
                ladrillo = new LadrilloMedio();
                break;
            case "rojo":
                ladrillo = new LadrilloFuerte();
                break;
        }
        return ladrillo;
    }
}
