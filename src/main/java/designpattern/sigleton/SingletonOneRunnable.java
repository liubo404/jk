package designpattern.sigleton;

public class SingletonOneRunnable implements Runnable {

    private SingletonOne s;

    public SingletonOneRunnable(SingletonOne s) {
        this.s = s;
        new Thread(this).start();
    }


    @Override
    public void run() {

        SingletonOne.getInstance();
    }

}
