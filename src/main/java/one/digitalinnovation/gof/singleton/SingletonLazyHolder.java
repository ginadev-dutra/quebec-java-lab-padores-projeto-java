package one.digitalinnovation.gof.singleton;

/**
 * Singleton "Lazy Holder".
 * Tem o consumo de memória mais otimizado
 */
public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia(){
        return InstanceHolder.instancia;
    }
}

