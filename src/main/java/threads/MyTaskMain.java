package threads;

public class MyTaskMain {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        
        MyTask mt = new MyTask();
        mt.pi();
        System.out.println("------------begin-------------");
        Thread t1 = new Thread(mt,"t1");
        Thread t2 = new Thread(mt,"t2");
        Thread t3 = new Thread(mt,"t3");
        t1.start();
        t2.start();
        t3.start();
        Thread.sleep(10000);
        System.out.println("------------end-------------");
        mt.pi();
    }

}
