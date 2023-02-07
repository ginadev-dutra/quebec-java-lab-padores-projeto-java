package one.digitalinnovation.gof;

/**
 * Singleton "preguiçoso".
 */
public class SingletonLazy {

    private static SingletonLazy instancia;

    // deixar o construtor privado
    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia(){
        if(instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}