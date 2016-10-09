package designpattern.sigleton;

public class Singleton {
    private final static Singleton INSTANCE = new Singleton();

    // private constructor
    private Singleton() {
        if (INSTANCE != null) {
            // SHOUT
            throw new IllegalStateException("Already instantiated");
        }
    }

    // default public constructor
    public static Singleton getInstance() {
        return INSTANCE;
    }
    
    public static void main(String[] args){
        System.out.println("hi");
        Singleton s = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
    }
}
