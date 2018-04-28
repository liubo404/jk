package threads;

import java.util.concurrent.*;

public class FutureAndCallableExample {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<String> callable = () ->{
            System.out.println("  [ Enter Callable]");
            TimeUnit.MILLISECONDS.sleep(20);
            return "Hello from Callable";
        };


        System.out.println("args = [Submitting Callable]");
        Future<String> future  = executorService.submit(callable);

        //This line executes immediately
        System.out.println("args = [Do something else while callable is getting executed]");

        System.out.println("args = [Retrieve the result of the future]");

        //Future.get() blocks until the result is available

        System.out.println("result = [" +  future.get() + "]");
        executorService.shutdown();
    }
}
