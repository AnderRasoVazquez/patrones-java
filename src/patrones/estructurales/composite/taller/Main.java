package patrones.estructurales.composite.taller;

public class Main {

    public static void main(String[] args){
        Compuesto cBase = new Compuesto("cBase");
        Compuesto c2 = new Compuesto("c2");
        Compuesto c3 = new Compuesto("c3");
        c2.addComponente(new Simple(2, "Tuerca"));
        c2.addComponente(new Simple(3,"Tornillo"));
        c3.addComponente(new Simple(3,"Tornillo"));
        c3.addComponente(new Simple(3,"Tornillo"));
        cBase.addComponente(c2);
        cBase.addComponente(c3);
        System.out.println(cBase.calcularPrecio()); // -> 11
    }

}
