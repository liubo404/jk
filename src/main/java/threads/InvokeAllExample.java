package threads;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class InvokeAllExample {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Callable<String> task1 = ()->{
            Thread.sleep(2000);
            return "Result of Task1";
        };
        Callable<String> task2 = ()->{
            Thread.sleep(1000);
            return "Result of Task2";
        };
        Callable<String> task3 = ()->{
            Thread.sleep(5000);
            return "Result of Task3";
        };

        List<Callable<String>> taskList = Arrays.asList(task1,task2,task3);

        List<Future<String>> futureList = executorService.invokeAll(taskList);

        //The result is printed only after all the futures are complete.
        for(Future<String> futre:futureList){
            System.out.println("args = [" + futre.get() + "]");
        }

        executorService.shutdown();
    }
}
