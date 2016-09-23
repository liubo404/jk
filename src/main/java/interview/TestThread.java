package interview;

import java.util.ArrayList;
import java.util.List;

public class TestThread {
    public static void main(String[] args) {
        RunnableDemo r1 = new RunnableDemo("Thread-1");
        r1.start();

        RunnableDemo r2 = new RunnableDemo("Thread-2");
        r2.start();

        ThreadDemo t3 = new ThreadDemo("T3");
        t3.start();

        ThreadDemo t4 = new ThreadDemo("T4");
        t4.start();
        
        List<Integer> roundList = new ArrayList<Integer>();
    }
}
