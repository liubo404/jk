package designpattern.sigleton;

public class SingletonOneRunnable implements Runnable {

	public void run() {
		SingletonOne.getInstance();

	}

	private SingletonOne s;

	public SingletonOneRunnable(SingletonOne s) {
		this.s = s;
		new Thread(this).start();
	}

}
