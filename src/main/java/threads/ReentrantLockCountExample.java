package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ReentrantLockCountExample {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        ReentrantLockCount reentrantLockCount = new ReentrantLockCount();

        for (int i = 0; i < 1000; i++) {
            executorService.submit(() -> reentrantLockCount.increment());
        }

        executorService.shutdown();
        executorService.awaitTermination(60, TimeUnit.SECONDS);

        System.out.println("Final count is = [" + reentrantLockCount.getCount() + "]");
    }
}
