package threads;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockCount {
    private final ReentrantLock lock = new ReentrantLock();

    private int count = 0;


    //Thread safe Increment
    public void increment() {
        lock.lock();
        try {
            count = count + 1;
        } finally {
            lock.unlock();
        }
    }

    public int getCount() {
        return count;
    }
}
