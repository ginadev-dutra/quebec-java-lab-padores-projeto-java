package one.digitalinnovation.gof.strategy;

public class Robo {

    private Comportamento comportamento; // o comportamento é a strategy

    public void setComportamento(Comportamento strategy) {
        this.comportamento = strategy;
    }

    public void mover(){
        comportamento.mover();
    }
}
