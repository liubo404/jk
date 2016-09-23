package interview;

public class ThreadDemo extends Thread {
    private Thread t;
    private String name;

    ThreadDemo(String name) {
        this.name = name;
        System.out.println("1.Creating thread" + name);
    }

    public void run() {
        System.out.println("2.Running Thread" + name);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread name:" + name + "id=" + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + name + " interrupted.");
        }

        System.out.println("Thread " + name + " exiting.");
    }

    
}
