package designpattern.sigleton;

public class Singleton {
    private static Singleton instance = null;

    private Singleton() {
        System.out.println("singletonOne from thread:" + Thread.currentThread().getName());
    }

    public   static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
