package patrones.comportamiento.strategy.op_matematicas;

import java.util.ArrayList;

public class ConjuntoNumeros {

    private ArrayList<Double> listaNum;
    private IOperation op;

    public ConjuntoNumeros() {
        listaNum = new ArrayList<>();
        op = new Suma();
    }

    public void addNum(Double n){
        listaNum.add(n);
    }

    public double ejecutar(){
        return op.ejecutar(listaNum);
    }

    public void setOp(IOperation op) {
        this.op = op;
    }
}
