package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

/**
 * https://www.callicoder.com/java-concurrency-issues-and-thread-synchronization/
 *
 * ThreadA : Retrieve count, initial value = 0
 * ThreadB : Retrieve count, initial value = 0
 * ThreadA : Increment retrieved value, result = 1
 * ThreadB : Increment retrieved value, result = 1
 * ThreadA : Store the incremented value, count is now 1
 * ThreadB : Store the incremented value, count is now 1
 */
public class RaceConditionExample {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Counter counter = new Counter();

        for(int i = 0; i < 1000; i++) {
            executorService.submit(() -> counter.increment());
        }

        executorService.shutdown();
        executorService.awaitTermination(60, TimeUnit.SECONDS);

        System.out.println("Final count is = [" + counter.getCount() + "]");
    }
}
