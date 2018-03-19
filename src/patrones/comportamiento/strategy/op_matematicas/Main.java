package patrones.comportamiento.strategy.op_matematicas;

public class Main {

    public static void main(String[] args) {
        ConjuntoNumeros conj = new ConjuntoNumeros();

        conj.addNum(2.0);
        conj.addNum(3.0);
        conj.addNum(4.0);

        System.out.println("Suma:");
        System.out.println(conj.ejecutar());
        System.out.println("Media:");
        conj.setOp(new Media());
        System.out.println(conj.ejecutar());
    }
}
