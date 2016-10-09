package threads;

public class MyTask implements Runnable {
    private int i = 0;

    public void run() {
        int j = 0;
        while (j < 10000) {
            j++;
            add();
        }
        System.out.println(Thread.currentThread().getName() + ":i=" + i);
    }

    private synchronized void add() {
        i++;
    }

    public void pi() {
        System.out.println(i);
    }

    public static void main(String[] args) throws InterruptedException {
        MyTask mt = new MyTask();
        mt.pi();
        System.out.println("------------begin-------------");
        Thread t1 = new Thread(mt, "t1");
        Thread t2 = new Thread(mt, "t2");
        Thread t3 = new Thread(mt, "t3");
        t1.start();
        t2.start();
        t3.start();
        Thread.sleep(10000);
        System.out.println("------------end-------------");
        mt.pi();
    }
}
