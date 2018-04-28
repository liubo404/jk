package threads;

/**
 * https://www.callicoder.com/java-concurrency-issues-and-thread-synchronization/
 *
 * Thread Interference Errors(Race Conditions)
 */
public class Counter {

    int count = 0;

    public void increment() {
        count = count + 1;
    }

    public int getCount() {
        return count;
    }
}
