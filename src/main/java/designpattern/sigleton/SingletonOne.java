package designpattern.sigleton;

/**
 * not thread safe
 * 
 * multiple thread will create more than one object
 * 
 * @author abc
 *
 */
public class SingletonOne {

    private static SingletonOne INSTANCE = null;

    private SingletonOne() {
        System.out.println("singletonOne from thread:" + Thread.currentThread().getName());
    }

    public static SingletonOne getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonOne();
        }
        return INSTANCE;
    }


}
